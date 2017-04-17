### SET FOLDER TO WATCH + FILES TO WATCH + SUBFOLDERS YES/NO
    $watcher = New-Object System.IO.FileSystemWatcher
    $watcher.Path = "$($env:USERPROFILE)\OneDrive2\"
    $watcher.Filter = "*.zip"
    $watcher.IncludeSubdirectories = $false
    $watcher.EnableRaisingEvents = $true  
    $logFile="$($env:USERPROFILE)\log.txt"
### DEFINE ACTIONS AFTER AN EVENT IS DETECTED
    $action = { 
                
                if(!(Test-Path $logFile))
                {
                   New-Item $logFile
                }
                $path = $Event.SourceEventArgs.FullPath
                $changeType = $Event.SourceEventArgs.ChangeType
                $logline = "$(Get-Date), $changeType, $path"  
                Add-content $logFile -value $logline
                 invoke-Command {C:\Users\praveenn\ChangeBuild.ps1 -zippath $path}
                 $time= Get-Date
                 Add-content "$logFile" -value "$($time) Test Started"   
                    
                
              }    
### DECIDE WHICH EVENTS SHOULD BE WATCHED 
    Register-ObjectEvent $watcher "Created" -Action $action
    while ($true) {sleep 5}