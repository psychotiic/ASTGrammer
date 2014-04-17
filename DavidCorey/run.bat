@ECHO OFF
set inputdir="c:\users\corey\desktop\input\input"
set projdir="D:\Github\ASTGrammer\DavidCorey\src\PLp1Initial\dist\PLp1Initial.jar"

for /f "tokens=* delims=" %%a in ('dir %inputdir% /s /b') do (
    echo Running %%a...
    type %%a
    echo.
    java -jar %projdir% %%a
    echo.
    pause
)

pause