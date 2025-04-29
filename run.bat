@echo off
cls
javac -encoding UTF-8 -d out src/Shared/*.java src/Representation/*.java src/Logic/*.java src/Storage/*.java

java -Dfile.encoding=cp866 -cp out Shared.StartGame

pause