Param(
    # [snip]
    [string] [Parameter(Mandatory=$true)] $zippath
)

$analysisConfigPath=$env:USERPROFILE + "\Analysis-config\plugins\"


Stop-Process -Name SapDesignStudio*

$tempPath= "$($env:USERPROFILE)\temp-vbi”

if(Test-Path $tempPath)
{
    Remove-Item "$($tempPath)\*” -recurse
}
else
{
    New-Item $tempPath
}



Add-Type -assembly “system.io.compression.filesystem”

[io.compression.zipfile]::ExtractToDirectory($zippath, $tempPath)


Copy-Item   “$($tempPath)\plugins\*” $analysisConfigPath -force 

C:\Program` Files\SAP` BusinessObjects\Design` Studio\SapDesignStudio.exe

sleep 180

invoke-Command {  cd  C:\Users\praveenn\Friday
                  java -jar Friday.jar}
