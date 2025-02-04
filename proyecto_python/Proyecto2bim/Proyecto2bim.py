global reporte
def principal():
    reporte = "Reporte:\n"
    bandera = True
    contador = 0
    contadores = [0] * 7
    actividades = ["Futbol", "Natacion", "Atletismo", "Basquetbol", "Ciclismo", "Tenis", "Yoga"]
    while bandera:
        print("\nIngrese un numero para el registro:")
        print("1) Futbol\n2) Natacion\n3) Atletismo\n4) Basquetbol\n5) Ciclismo\n6) Tenis\n7) Yoga")
        numero = int(input())
        if numero == 1:
            reporte += registrarParticipanteFutbol()
            contadores[numero - 1] += 1
        elif numero == 2:
            reporte += registrarParticipanteNatacion()
            contadores[numero - 1] += 1
        elif numero == 3:
            reporte += registrarParticipanteAtletismo()
            contadores[numero - 1] += 1
        elif numero == 4:
            reporte += registrarParticipanteBasquetbol()
            contadores[numero - 1] += 1
        elif numero == 5:
            reporte += registrarParticipanteCiclismo()
            contadores[numero - 1] += 1
        elif numero == 6:
            reporte += registrarParticipanteTenis()
            contadores[numero - 1] += 1
        elif numero == 7:
            reporte += registrarParticipanteYoga()
            contadores[numero - 1] += 1
        else:
            print("Esta actividad no esta disponible en el club")
            contador -= 1

        
        salida = input("\nIngrese 'si' para salir del ciclo: ").lower()
        if salida == "si":
            bandera = False
        
        contador += 1

    reporte2 = obtenerReporte(contadores, actividades)
    mensaje = obtenerInformacion(contador)

    print(reporte)
    print(mensaje)
    print(reporte2)

def obtenerInformacion(contador):
    mensaje = f"Total de actividades creadas: {contador}\n"
    if contador == 0:
        mensaje += "Mala campana, debemos mejorar"
    elif 1 <= contador <= 5:
        mensaje += "Poca participacion en el club, hay que mejorar"
    elif 6 <= contador <= 15:
        mensaje += "Buena participacion, sigue asi"
    else:
        mensaje += "Excelente campana del club"
    return mensaje

def obtenerReporte(contadores, actividades):
    cadena = ""
    for i in range(7):
        cadena += f"{i+1}. Numero de participantes de {actividades[i]}: {contadores[i]}\n"
    return cadena


def registrarParticipanteFutbol():
    nombre = input("Ingrese el nombre del participante: ")
    posicion = input("Ingrese la posicion favorita del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    equipo = input("Ingrese el equipo favorito del participante: ")
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nPosicion favorita: {posicion}\nCiudad: {ciudad}\nEquipo favorito: {equipo}\n"
    return cadena

def registrarParticipanteNatacion():
    nombre = input("Ingrese el nombre del participante: ")
    nivel = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    estilo = input("Ingrese el estilo favorito del participante: ")
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo favorito: {estilo}\n"
    return cadena

def registrarParticipanteAtletismo():
    nombre = input("Ingrese el nombre del participante: ")
    especialidad = input("Ingrese la especialidad del participante (Carreras, Saltos, Lanzamiento): ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    record = float(input("Ingrese el record personal del participante: "))
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nEspecialidad: {especialidad}\nCiudad: {ciudad}\nRecord personal: {record}\n"
    return cadena

def registrarParticipanteBasquetbol():
    nombre = input("Ingrese el nombre del participante: ")
    posicion = input("Ingrese la posicion preferida del participante: ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    estatura = float(input("Ingrese la estatura del participante: "))
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nPosicion favorita: {posicion}\nEstatura: {estatura}\nCiudad: {ciudad}\n"
    return cadena

def registrarParticipanteCiclismo():
    nombre = input("Ingrese el nombre del participante: ")
    tipo = input("Ingrese el tipo de ciclismo (Montana, Ruta, Urbano): ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    marca = input("Ingrese la marca de bicicletas preferida: ")
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nTipo de ciclismo: {tipo}\nCiudad: {ciudad}\nMarca favorita: {marca}\n"
    return cadena

def registrarParticipanteTenis():
    nombre = input("Ingrese el nombre del participante: ")
    nivel = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    mano = input("Ingrese la mano habil del participante (derecha/izquierda): ")
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nMano habil: {mano}\n"
    return cadena

def registrarParticipanteYoga():
    nombre = input("Ingrese el nombre del participante: ")
    nivel = input("Ingrese el nivel del participante (Principiante, Intermedio, Avanzado): ")
    edad = int(input("Ingrese la edad del participante: "))
    ciudad = input("Ingrese la ciudad del participante: ")
    estilo = input("Ingrese el estilo de yoga favorito del participante: ")
    
    cadena = f"\nNombre: {nombre}\nEdad: {edad}\nNivel: {nivel}\nCiudad: {ciudad}\nEstilo favorito: {estilo}\n"
    return cadena


# Aqui tuvimos que agregar esto para leyera la funcion principal
# sin esto no se iniciaba correctamente
if __name__ == "__main__":
    principal()
