#!/bin/bash
# Pidiendo el primer numero
read -p "Ingrese un numero: " n1

# Analizando el signo del primer numero
if [ $n1 -gt 0 ]; then
	echo "El primer numero es positivo"
elif [ $n1 -lt 0 ]; then
	echo "El primer numero es negativo"
else
	echo "El primer numero es cero"
fi

# Pidiendo el segundo numero
read -p "Ingrese otro numero: " n2

# Comparando n1 y n2
if [ $n1 -gt $n2 ]; then
        echo "El primer numero es mayor"
elif [ $n1 -lt $n2 ]; then
        echo "El segundo numero es mayor"
else
        echo "Ambos numeros ingresados son iguales"
fi

# Pidiendo opcion
read -p "Ingrese una opcion (1/2/3): " option

# Casos
case $option in
	1) echo "Eligio el numero 1";;
	2) echo "Eligio el numero 2";;
	3) echo "Eligio el numero 3";;
esac

# Imprimiendo los numeros del 1 al 10
for n in {1..10}
do
	if [ $n -eq 5 ]; then
		continue
	elif [ $n -eq 8 ]; then
		break
	fi
	echo "$n"
done

# Pidiendo un numero con la condicion que no sea cero
numero=1
count=0
until [ $numero -eq 0 ]
do
	read -p "Ingrese un numero (0 para escapar del bucle): " numero
	if [ $numero -ne 0 ]; then
		((count++))
	fi
done

# Imprimiendo la cantidad de numeros distintos de cero
echo "EL numero de numeros ingresados es $count" 

# Creando la funcion saludar
saludar(){
	echo "Hola $1, bienvenido al script"
}
saludar "Hector"

# Haciendo funcion sumar
sumar(){
	local resultado=$(( $1 + $2 ))
	echo $resultado
}

suma=$(sumar 5 3)
echo "La suma es: $suma"

# Manejo de errores
cp no_existe_archivo.txt ./ || echo "No se pudo copiar"

# Autor: Hector
# Fecha: 25/02/26
# Descripcion: Mis scripts
for archivo in *.sh
do
	echo $archivo
done
