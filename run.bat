@echo off
cls
javac -encoding UTF-8 Main.java

java -Dfile.encoding=UTF-8 -cp . Main

pause