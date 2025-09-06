# Respuestas sobre Git y Java Collections

## 1. Diferencia entre `git merge` y `git rebase`

- **git merge**: Combina el historial de dos ramas en un nuevo commit de fusión, manteniendo la historia tal como sucedió.  
  Ejemplo:  

- **git rebase**: Reescribe la historia, aplicando los commits de una rama encima de otra, como si siempre hubieran estado ahí.  

## 2. Si dos ramas modifican la misma línea de un archivo, ¿qué sucede al hacer `merge`?
Se genera un **conflicto**. Git no sabe qué cambio conservar y te pide resolverlo manualmente editando el archivo y eligiendo el contenido correcto antes de continuar.


## 3. Ver gráficamente el historial de merges y ramas en consola
Se pueden usar varias cosas:
```bash o git log --oneline --graph --decorate --all

## 4 Diferencia entre un commit y un push 
 commit: Guarda los cambios en tu repositorio local con un mensaje descriptivo.

 push: Envía esos commits al repositorio remoto 

## 5. Para que sirve `git stash` y `git pop`
git stash: Guarda temporalmente los cambios no confirmados para dejar el área de trabajo limpia, sin hacer un commit.

git stash pop: Recupera los cambios guardados con stash y los aplica nuevamente en el área de trabajo.

