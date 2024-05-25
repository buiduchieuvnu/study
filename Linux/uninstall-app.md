# Hướng dẫn gỡ cài đặt app
- Search app cần uninstall
```sh
sudo dpkg --list | grep xxx
```

- Uninstall
```sh
sudo apt remove <package_name> 
sudo apt remove <package_name_1> <package_name_2>
sudo apt purge <package_name> 
sudo apt-get clean
```
