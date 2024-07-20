# Android-Studio
- Download: [Link](https://developer.android.com/studio?gad_source=1&gclid=CjwKCAjwnei0BhB-EiwAA2xuBktAd86v_SjfIefI3ozjNDSjxed76JtfEW4lQDfD7Q3M12vwgR9OCBoCoHoQAvD_BwE&gclsrc=aw.ds&hl=vi)

- Giaỉ nén
```sh
tar -xzvf android-studio-2024.1.1.12-linux.tar.gz
```
- Move to opt
```sh
sudo mv android-studio /opt/
```
- Start
```sh
/opt/android-studio/bin/studio.sh
```
- Tạo shortcut
```sh
nano ~/.local/share/applications/android-studio.desktop
```

```txt
[Desktop Entry]
Version=1.0
Type=Application
Name=Android Studio
Exec=/opt/android-studio/bin/studio.sh
Icon=/opt/android-studio/bin/studio.png
Comment=Android Studio
Categories=Development;IDE;
Terminal=false
```
