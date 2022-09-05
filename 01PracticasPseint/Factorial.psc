Algoritmo Factorial
	Definir n, f Como Real
	f<-1
	Repetir
	Escribir "Ingrese un numero positivo"
	Leer n
	Para i<-1 Hasta n Con Paso 1 Hacer
		f<-f*i
	Fin Para
	Escribir "El factorial de ", n ," Es: " , f
	Escribir "Repetir si o no"
	Leer resp
Hasta Que resp = "no"
FinAlgoritmo
