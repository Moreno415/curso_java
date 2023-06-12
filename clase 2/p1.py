alumnos = []
i=0
j=0

cantidad = int(input("ingrese cantidad de alumno: "))
print("------------------------------------------")

while i<cantidad: 
    nombre = input("ingrese el nombre del alumno: ") 
    edad = int(input("ingrese la edad del alumno: "))
    print("------------------------------------------")
    alumnos.append([nombre,edad])
    i = i+1


alumnos.sort(key=lambda x : x [1],reverse=True)
while j<cantidad:
    print(f"el alumno {alumnos[j][0]} tiene {alumnos[j][1]} a;os")
    j=j+1
    
print("------------------------------------------")
edad_prof = max(alumnos,key=lambda x : x [1])
edad_asis = min(alumnos,key=lambda x : x [1])
print(f"el profesor es {edad_prof[0]} y su edad es {edad_prof[1]}")
print(f"el asistente es {edad_asis[0]} y su edad es {edad_asis[1]}")