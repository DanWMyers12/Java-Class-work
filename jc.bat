@ECHO OFF
IF '%1'=='' GOTO error
IF NOT EXIST %1 GOTO notfound
set path=%PATH%;C:\Program Files\Java\jdk1.8.0_144\bin
ECHO.
ECHO Compiling '%1'...
javac "%~f1"
ECHO done!
ECHO.
ECHO Executing '%~n1':
ECHO.
java %~n1
GOTO end
:error
ECHO.
ECHO Invalid syntax. Please use:
ECHO.
ECHO yall {filename}
GOTO end
:notfound
ECHO.
ECHO File '%1' not found.
GOTO end
:end
ECHO ON