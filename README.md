# Roles

# Sistema de Roles en Java

## Descripción

Este proyecto es una práctica de Programación Orientada a Objetos (POO) en Java.

El objetivo es implementar un sistema básico de usuarios con diferentes niveles de permisos utilizando:

- Herencia
- Objetos
- Clases
- Constructores
- ArrayList
- Validación por roles

No utiliza bases de datos ni librerías externas; todo se ejecuta en memoria.

---

## Estructura del proyecto

```
Main.java
User.java
Admin.java
SuperAdmin.java
Tablero.java
```

### User

Representa a un usuario del sistema.

Atributos:

- nombre
- correo
- contraseña
- rol

---

### Admin

Hereda de `User`.

Puede realizar acciones administrativas sobre la lista de usuarios.

---

### SuperAdmin

Hereda de `User`.

Tiene permisos superiores a un administrador.

---

### Tablero

Administra las listas del sistema.

Contiene:

- Lista de usuarios

También valida el rol antes de ejecutar acciones administrativas.

---

## Roles

Actualmente existen tres roles.

| Rol | Permisos |
|------|----------|
| USER | Solo representa un usuario |
| ADMIN | Puede administrar usuarios |
| SUPERADMIN | Puede realizar todas las acciones administrativas |

---

## Conceptos utilizados

- Programación Orientada a Objetos
- Herencia
- Encapsulamiento (en futuras versiones)
- Constructores
- Objetos
- Métodos
- Validación de permisos
- ArrayList

---

## Ejemplo de uso

```java
Tablero tablero = new Tablero();

User juan = new User(
    "Juan",
    "juan@gmail.com",
    "1234",
    "USER"
);

Admin pedro = new Admin(
    "Pedro",
    "pedro@gmail.com",
    "1234"
);

tablero.agregarUsuario(pedro, "Carlos");
```

---

## Objetivos del proyecto

- Comprender la herencia en Java.
- Practicar la creación de objetos.
- Implementar un sistema simple de roles.
- Aprender a validar permisos mediante atributos.
- Organizar el código utilizando clases con responsabilidades definidas.

---

## Posibles mejoras

- Login de usuarios.
- Menús interactivos.
- Validación de correo electrónico.
- Cifrado de contraseñas.
- Gestión de administradores.
- Persistencia con archivos o SQLite.
- Uso de `enum` para los roles.
- Interfaces gráficas.

---

## Autor

Proyecto desarrollado con fines educativos para practicar Programación Orientada a Objetos en Java.
