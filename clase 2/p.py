estudiantes = [    ['Juan', 24, [9, 8, 7]],
    ['María', 30, [7, 8, 6]],
    ['Pedro', 18, [8, 6, 9]],
    ['Ana', 22, [6, 7, 8]]
]


estudiantes.sort(key=lambda x: sum(x[2])/len(x[2]))

print(estudiantes)