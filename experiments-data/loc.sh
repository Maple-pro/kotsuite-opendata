#!/bin/bash

project_paths=(
    "./repos/ad-free"
    "./repos/CineLog"
    "./repos/gpstest"
    "./repos/WiFiAnalyzer"
)

for project in "${project_paths[@]}"; do
    echo "$project"
    cloc --vcs git "$project" --fullpath --exclude-dir=kotsuite --include-lang=Java,Kotlin
done
