

# Trianafy
**Trianafy** es una *API* usada para almacenar datos sobre música, siendo esto artistas, canciones y playlist.
[README ORIGINAL](https://github.com/TrayZNix/trianafy/blob/main/README.md)

## Cambios realizados para el testado de JSONView:
Para comprobar el comportamiento de JSONView, he optado por añadir dos parametros extra a un artista, teléfono y dni. Por defecto, estos no se devuelven. Para consultarlos se debe acceder desde el siguiente endpoint
***GET***  `localhost:8080/artist/secure/{id}`
