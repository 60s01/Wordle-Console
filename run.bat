@echo off
cls

dir /B /S src\wordle\*.java > sources.txt

javac -encoding UTF-8 -d out @sources.txt

del sources.txt

java -Dfile.encoding=cp866 -cp out wordle.StartGame

pause