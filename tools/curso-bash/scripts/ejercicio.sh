#!/bin/bash
echo "Hola, mundo"
echo "La fecha es $(date) y estamos en el directorio $(pwd)"
name="Hector"
echo "Tu nombre es $name"
a=1
b=2
suma=$((a+b))
resta=$((a-b))
producto=$((a*b))
echo "La suma es $suma"
echo "La resta es $resta"
echo "El producto es $producto"
read -p "Tu nombre: " name
echo "Tu nombre es $name"
read -p "Digite el primer numero: " n1
read -p "Digite el segundo numero: " n2
suma2=$((n1+n2))
echo "La suma de ambos numeros es $suma2"
echo "El primer argumento es $1"
echo "El tercer argumento es $3"
echo "EL numero de argumentos es $#"
suma3=$(($1+$2))
resta2=$(($1-$2))
multi=$(($1*$2))
division=$(($1/$2))
echo "Suma $suma3, Resta $resta2, Multiplicacion $multi, Division $division"
echo "$name" > archivo.txt


