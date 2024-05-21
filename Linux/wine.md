# Wine
> Phần mềm cài exe trên linux

```sh
sudo apt-get install wine64

wget -qO- https://dl.winehq.org/wine-builds/winehq.key | sudo apt-key add -

sudo apt install software-properties-common

sudo apt-add-repository 'deb http://dl.winehq.org/wine-builds/ubuntu/ bionic main'

sudo apt-get install --install-recommends winehq-stable

# Check
wine --version

# Config
winecfg
```