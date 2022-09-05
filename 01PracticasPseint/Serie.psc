Algoritmo Serie
	Definir n, a, b Como Entero
	Repetir
	Escribir "Ingrese un numero"
	Leer n
	x = 1
	a = 0
	b = 1
	Mientras x <= n Hacer
		Escribir a
		Escribir b
		a = a + b
		b = b + a
		x = x + 1
	Fin Mientras
	Escribir "Repetir si o no"
	Leer resp
Hasta Que resp = "no"
FinAlgoritmo
