@echo off
cls
javac -encoding UTF-8 -d out src/wordle/*.java src/wordle/logic/*.java src/wordle/representation/*.java src/wordle/shared/*.java src/wordle/storage/*.java

java -Dfile.encoding=cp866 -cp out wordle.StartGame

pause