@echo off
cls
javac -encoding UTF-8 -d out src/Representation/*.java src/Shared/*.java 

java -Dfile.encoding=cp866 -cp out Shared.StartGame

pause