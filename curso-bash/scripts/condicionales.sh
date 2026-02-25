#!/bin/bash
num=25
if [ $num -ge 10 ]; then
	echo "NUmero mayor o igual que 10"
elif [ $num -eq 0 ]; then
	echo "NUmero igual a 0"
else
	echo "Condicion por defecto"
fi
read -p "Elige una opcion (1/2/3): " option
case $option in
	1) echo "Elegiste 1";;
	2) echo "Elegiste 2";;
	3) echo "Elegiste 3";;
	*) echo "Opcion no valida";;
esac
name="Hector"
if [ -n $name ]; then
	echo "El nombre existe"
fi
if [ $num -ge 18 ] && [ -n $name ]; then
	echo "Mayor de edad"
fi
if [ -e "./script.sh" ]; then
	echo "EL archivo existe"
fi
