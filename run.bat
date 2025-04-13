@echo off
cls
javac -encoding UTF-8 Main.java

java -Dfile.encoding=cp866 -cp . Main

pause