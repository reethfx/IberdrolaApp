<p align="center">
</p>

<p align="center">
    <a href="https://github.com/reethfx/IberdrolaApp/stargazers">
        <img height= "24" src="https://img.shields.io/github/stars/reethfx/IberdrolaApp?colorA=1e1e28&colorB=c9cbff&style=for-the-badge">
    </a>
    <a href="https://github.com/reethfx/IberdrolaApp/issues">
        <img height= "24" src="https://img.shields.io/github/issues/reethfx/IberdrolaApp?colorA=1e1e28&colorB=f7be95&style=for-the-badge">
    </a>
    <a href="https://github.com/reethfx/IberdrolaApp/contributors">
        <img height= "24" src="https://img.shields.io/github/contributors/reethfx/IberdrolaApp?colorA=1e1e28&colorB=b1e1a6&style=for-the-badge">
    </a>
</p>

## Descripción del proyecto

Aunque el proyecto estaba descrito para ser más sencillo, creo que era una buena oportunidad para mejorar mis habilidades con Angular y Tailwind, por lo que decidí agregarle un poco mas de complejidad, haciendo una aplicación fullstack con SpringBoot.

La aplicación está diseñada con un sistema de autenticación, un dashboard, un módulo de clientes y otro de contratos, aunque este último no está acabado.
La arquitectura para comunicar la base de datos con la aplicación se hace mediante una API personalizada, montada desde cero con SpringBoot.

<b><img src="https://cdn-icons-png.flaticon.com/512/6897/6897039.png" width="14"/> El proyecto no esta finalizado al completo!</b>

<p>
</p>

## Diseño de la base de datos

#### Esquema E-R de la base de datos

El diseño en el que me he basado para montar toda la arquitectura de la base de datos PostgreSQL es el siguiente:
<p align="center">
    <img src="./frontend/src/assets/images/esquema-er.png" width="800"/>
</p>

#### Diseño físico de la base de datos
| Estado de la DB           | Link                                          | 
| ------------------------- | :-------------------------------------------- |
| `Sin disparadores`        | [Aquí](https://pastebin.com/rpKPt8X3)         |
| `Disparadores`            | [Aquí](https://pastebin.com/x0QwMgta)         |

<b><img src="https://cdn-icons-png.flaticon.com/512/6897/6897039.png" width="14"/> Los disparadores no estan acabados por varias dudas planteadas durante el desarrollo!</b>

## Arquitectura de la aplicación
#### Versiones

<a href="https://angular.io"><img height= "24" src= "https://img.shields.io/badge/Angular 16-DD0031?style=for-the-badge&logo=angular&logoColor=white"></a> <a href="https://tailwindcss.com"><img height= "24" src= "https://img.shields.io/badge/Tailwind 3-0ea5e9?style=for-the-badge&logo=tailwind-css&logoColor=white"></a>

#### Features

- [x] Sidebar
- [x] Dark Theme
- [x] Navbar
- [x] Footer
- [x] Auth Module
- [x] Dashboard Module
- [x] Standalone components
- [x] Client CRUD
- [x] Client Module
- [x] Contracts CRUD
- [ ] Contracts Module
- [ ] Invoices CRUD
- [ ] Invoices Module


#### Commandos necesarios para ejecutar el proyecto

| Comando                   | Qué hace?                                     | 
| ------------------------- | :-------------------------------------------- |
| `npm install`             | Instala las dependencias necesarias           |
| `npm run start`           | Inicia el servidor                            |

#### Iconos y Patrones

Este proyecto [Hero Icons](https://heroicons.com/) y [Hero Patterns](https://heropatterns.com/)

#### Disclaimer

The Tailwind name and logos are trademarks of Tailwind Labs Inc.
The Angular name and logos are trademarks of Google.
