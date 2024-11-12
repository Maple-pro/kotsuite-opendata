"""
读取 overall_xxx.json，用于生成项目的概览信息，以及搜集有哪些类的可测方法最多
"""
import json
import os
import pprint

def analyze_json_file(file_path):
    with open(file_path, 'r') as file:
        data = json.load(file)
        return data


def anayze_project(project_dir):
    json_files = []
    all_classes = []

    # Get all json file belongs to the project
    for file_name in os.listdir(os.path.abspath(project_dir)):
        if (file_name.endswith('.json')):
            json_file_path = os.path.join(project_dir, file_name)
            json_files.append(json_file_path)

            json_data = analyze_json_file(json_file_path)
            classes = json_data['classes']
            all_classes.extend(classes)
    
    return all_classes


def get_projects_data():
    # project_dirs = ['SystemUi/', 'OppoGallery3D/', 'OppoLauncher/']
    project_dirs = [
        './open-source/overall_statistic/ad-free/20241103_111355',
        './open-source/overall_statistic/CineLog/20241103_111437',
        './open-source/overall_statistic/gpstest/20241103_174000',
        './open-source/overall_statistic/WiFiAnalyzer/20241102_223057'
    ]

    for project_dir in project_dirs:
        all_classes = anayze_project(project_dir)
        all_classes_map = { item['className']: item for item in all_classes }

        all_class_num = 0 # 所有类的数量
        all_method_num = 0 # 所有方法的数量

        # Class type num
        no_need_to_test_class_num = 0
        need_but_unable_class_num = 0
        enable_class_num = 0

        # Class reason num
        anonymous_class_num = 0
        non_public_class_num = 0
        abstract_class_num = 0
        interface_class_num = 0
        data_class_num = 0
        package_level_class_num = 0
        unsupported_classs_num = 0
        enable_class_num = 0

        # Method type num
        in_no_need_to_test_class_method_num = 0 # 处于没必要测试类的方法的数量
        in_need_but_unable_class_method_num = 0 # 处于无法测试的类的方法的数量
        no_need_to_test_method_num = 0
        need_but_unable_method_num = 0
        enable_method_num = 0

        # Method reason num
        non_public_method_num = 0
        constructor_method_num = 0
        anonymous_method_num = 0
        abstract_method_num = 0
        get_set_method_num = 0
        component_n_method_num = 0
        override_method_num = 0
        unsupported_method_num = 0
        enable_method_num = 0

        for value in all_classes:
            all_class_num += 1
            class_type = value['classType']
            class_reason = value['classReason']
            methods = value['methods']
            all_method_num += len(methods)

            # 不需要测试的类
            if class_type == 'NO_NEED_TO_TEST':
                no_need_to_test_class_num += 1
                # 获取无法测试的类的原因
                if class_reason == 'ANONYMOUS_CLASS':
                    anonymous_class_num += 1
                elif class_reason == 'NON_PUBLIC_CLASS':
                    non_public_class_num += 1
                elif class_reason == 'ABSTRACT_CLASS':
                    abstract_class_num += 1
                elif class_reason == 'INTERFACE_CLASS':
                    interface_class_num += 1
                elif class_reason == 'DATA_CLASS':
                    data_class_num += 1
                elif class_reason == 'PACKAGE_LEVEL_CLASS':
                    package_level_class_num += 1
                elif class_reason == 'UNSUPPORTED_CLASS':
                    unsupported_classs_num += 1
                elif class_reason == 'ENABLE_CLASS':
                    enable_class_num += 1

                # 所有的方法均为不需要测试的方法
                in_no_need_to_test_class_method_num += len(methods)

            # 需要但是无法测试的类
            elif class_type == 'NEED_BUT_UNABLE':
                need_but_unable_class_num += 1
                # 所有的方法均为无法测试的方法
                in_need_but_unable_class_method_num += len(methods)

            # 能测试的类
            elif class_type == 'ENABLE':
                enable_class_num += 1

                # 获取方法的信息
                for method in methods:
                    method_type = method['methodType']
                    method_reason = method['methodReason']
                    
                    if method_type == 'NO_NEED_TO_TEST':
                        no_need_to_test_method_num += 1
                        if method_reason == 'NON_PUIBLIC_METHOD':
                            non_public_method_num += 1
                        elif method_reason == 'CONSTRUCTOR_METHOD':
                            constructor_method_num += 1
                        elif method_reason == 'ANONYMOUS_METHOD':
                            anonymous_method_num += 1
                        elif method_reason == 'ABSTRACT_METHOD':
                            abstract_method_num += 1
                        elif method_reason == 'GET_SET_METHOD':
                            get_set_method_num += 1
                        elif method_reason == 'COMPONENT_N_METHOD':
                            component_n_method_num += 1
                        elif method_reason == 'OVERRIDE_METHOD':
                            override_method_num += 1
                        elif method_reason == 'UNSUPPORTED_METHOD':
                            unsupported_method_num += 1
                        elif method_reason == 'ENABLE_METHOD':
                            enable_method_num += 1

                    elif method_type == 'NEED_BUT_UNABLE':
                        need_but_unable_method_num += 1

                    elif method_type == 'ENABLE':
                        enable_method_num += 1

        # Print project information
        print("--------------------")
        print("项目: {}".format(project_dir))

        print("所有类的数量: {}".format(all_class_num))

        print("不需要测试的类的数量: {}".format(no_need_to_test_class_num))
        print("\t匿名类的数量: {}".format(anonymous_class_num))
        print("\t非公共类的数量: {}".format(non_public_class_num))
        print("\t抽象类的数量: {}".format(abstract_class_num))
        print("\t接口类的数量: {}".format(interface_class_num))
        print("\t数据类的数量: {}".format(data_class_num))
        print("\t包级别类的数量: {}".format(package_level_class_num))

        print("需要但是无法测试的类的数量: {}".format(need_but_unable_class_num))

        print("可以测试的类的数量: {}".format(enable_class_num))

        print("所有方法的数量: {}".format(all_method_num))

        print("「不需要测试的类」中方法的数量: {}".format(in_no_need_to_test_class_method_num))

        print("「需要但是无法测试的类」中方法的数量: {}".format(in_need_but_unable_class_method_num))

        print("不需要测试的方法的数量: {}".format(no_need_to_test_method_num))
        print("\t非公共方法的数量: {}".format(non_public_method_num))
        print("\t构造函数方法的数量: {}".format(constructor_method_num))
        print("\t匿名方法的数量: {}".format(anonymous_method_num))
        print("\t抽象方法的数量: {}".format(abstract_method_num))
        print("\tget/set 方法的数量: {}".format(get_set_method_num))
        print("\tcomponentN 方法的数量: {}".format(component_n_method_num))
        print("\t生命周期方法的数量: {}".format(override_method_num))

        print("需要但是无法测试的方法的数量: {}".format(need_but_unable_method_num))

        print("可以测试的方法的数量: {}".format(enable_method_num))


"""
搜集可测方法最多的前十个类
"""
def get_test_classes(project_dir):
    classes = anayze_project(project_dir)
    
    class_with_method_num = {}

    for clazz in classes:
        if clazz['classType'] != 'ENABLE':
            continue

        methods = clazz['methods']
        enable_method_num = sum(1 for method in methods if method['methodType'] == 'ENABLE')
        class_with_method_num[clazz['className']] = enable_method_num

    sorted_class_with_method_num = sorted(class_with_method_num.items(), key=lambda item: item[1], reverse=True)[:10]

    pp = pprint.PrettyPrinter(indent=2)

    print('--------------------')
    print(project_dir)
    pp.pprint(sorted_class_with_method_num)


if __name__ == '__main__':
    get_projects_data()
    # get_test_classes('OppoLauncher/')
    # get_test_classes('OppoGallery3D/')
