#!/bin/bash

# Faculty Management System - Compile and Run Script

echo "=== Faculty Management System - Improved Version ==="
echo "Compiling Java files..."

# Create data directory if it doesn't exist
mkdir -p data

# Compile all Java files
javac -cp . *.java model/*.java service/*.java util/*.java interfaces/*.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    echo "Compilation successful!"
    echo "Starting Faculty Management System..."
    echo "========================================="
    java FacultyManagementSystem
else
    echo "Compilation failed. Please check for errors."
    exit 1
fi