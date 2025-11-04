# Documentación del Entorno Docker con Múltiples Bases de Datos

## Verificación de Instalación

Se confirmó que **Docker** está correctamente instalado y operativo en el entorno.  
**Versión detectada:** Docker versión 19.03.1

---

## Creación del Archivo de Definición de Servicios

Se creó el archivo que contiene la definición de los servicios **MySQL**, **PostgreSQL**, **SQL Server** y **MongoDB**, especificando sus:

- Puertos
- Contraseñas
- Contenedores
- Volúmenes

En la terminal **Docker Quickstart**, se accedió a la carpeta de trabajo ubicada en la ruta:

```
/c/Users/Usuario/docker-bases
```

Posteriormente, se creó el archivo `docker-compose.yml` utilizando el editor **Bloc de notas**, el cual contiene la configuración de los cuatro servicios con sus respectivos nombres de contenedor, contraseñas, puertos y volúmenes persistentes.

---

## Limpieza y Reconfiguración del Entorno

Se eliminaron los contenedores anteriores que generaban conflicto mediante el comando:

```bash
docker rm -f
```

Luego, se ejecutó nuevamente:

```bash
docker-compose up -d
```

Creando correctamente los nuevos contenedores para **MySQL**, **PostgreSQL**, **SQL Server** y **MongoDB**.  
Todos los servicios fueron levantados exitosamente.

---

## Verificación de Contenedores en Ejecución

Se utilizó el comando:

```bash
docker ps
```

para comprobar el estado de los contenedores.

- Se confirmó que los servicios de **MySQL**, **PostgreSQL**, **SQL Server** y **MongoDB** se encuentran activos.
- Todos los contenedores presentan el estado **Up**, indicando una ejecución satisfactoria del entorno.
- Se confirmaron las descargas de las imágenes y la creación exitosa de los contenedores.

**Imágenes descargadas:**
- MySQL 5.7  
- PostgreSQL 10  
- SQL Server 2017  
- MongoDB 4.2

---

## Configuración de Volúmenes Persistentes

Se verificó la creación de los volúmenes asociados a cada servicio mediante el comando:

```bash
docker volume ls
```

Los volúmenes garantizan la **persistencia de los datos** incluso si los contenedores se detienen o eliminan.

**Volúmenes creados:**
- `docker-bases_mysql_data`
- `docker-bases_postgres_data`
- `docker-bases_sqlserver_data`
- `docker-bases_mongo_data`

---

## Creación de la Imagen Personalizada de Ubuntu

Se creó un archivo **Dockerfile** basado en la imagen oficial de **Ubuntu 20.04**, configurando la instalación de herramientas básicas como:

- `curl`
- `wget`
- `vim`
- `net-tools`
- `iputils-ping`

Estas herramientas permiten ejecutar comandos de red y administración dentro del contenedor.

---

## Definición en Docker Compose

Se configuró un archivo `docker-compose.yml` que construye una imagen personalizada de Ubuntu a partir del Dockerfile.  
Se definió el contenedor:

```
ubuntu-container
```

basado en la imagen `ubuntu-custom:1.0`, con soporte para interacción mediante consola (`tty` y `stdin_open`) y un volumen asignado a la carpeta `/home`.

### Parámetros definidos:
- **Puertos:** 8080 y 22  
- **Credenciales de acceso:**  
  - USER = admin  
  - PASSWORD = ubuntu123  
- **Volumen persistente:** Compartido entre el host y el contenedor

---

## Descarga de Imagen Base

Se descargó la imagen oficial de Ubuntu 20.04 desde el repositorio de Docker Hub con el comando:

```bash
docker pull ubuntu:20.04
```

Esta imagen sirve como base para construir el contenedor personalizado definido en el Dockerfile.

---

## Construcción de la Imagen Personalizada

Se utilizó un Dockerfile con la imagen base `ubuntu:20.04`, agregando herramientas administrativas.  
Luego se ejecutó:

```bash
docker-compose build
```

Generando exitosamente la imagen:

```
ubuntu-custom:1.0
```

---

## Resultado Final

Se completó exitosamente la **configuración y ejecución** de los servicios:

- **MySQL**
- **PostgreSQL**
- **SQL Server**
- **MongoDB**

mediante **Docker Compose**.

Adicionalmente, se construyó una **imagen personalizada de Ubuntu (ubuntu-custom:1.0)** con herramientas administrativas y soporte para conexión a los contenedores de bases de datos.

Todos los servicios cuentan con **volúmenes persistentes** y se verificó la **correcta construcción y despliegue** de cada contenedor.

---

**Fin de la documentación**
