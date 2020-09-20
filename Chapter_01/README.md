### Spring简介

**spring是什么？**

spring是一个开源框架，是为了解决企业级应用开发的复杂性而创建的。创建Spring的主要目的是用来代替更加重量级的企业级Java技术，尤其是EJB——企业级JavaBean（Enterprise JavaBean，EJB）。

**spring诞生的由来**

为了代替Java企业级开发：EJB

**Spring的两个核心特性**：依赖注入（dependency injection，DI），面向切面编程（aspect-oriented programming，AOP）

**为了降低Java开发的复杂性，Spring采用了以下4种关键策略：**

* 基于POJO的轻量级和最小侵入性编程；
* 通过依赖注入和面向接口编程实现松耦合；
* 基于切面和惯性进行声明式编程；
* 通过切面和模板减少样板式代码。

### Spring容器

**容器**是spring框架的**核心**！Spring容器并不只有一种，spring自带了多个容器的实现，可以归为两种不同类型：**bean工厂**、**应用上下文**。bean工厂对于大多数应用来说往往太低级了，所以应用上下文比bean工厂更加受欢迎。

spring**自带的**应用上下文（**最有可能遇到的**）：

- AnnotationConfigApplicationContext：从一个或多个基于Java的配置类中加载Spring应用上下文。
- AnnotationConfigWebApplicationContext：从一个或多个基于Java的配置类中加载Spring Web应用上下文。
- ClassPathXmlApplicationContext：从类路径下的一个或多个XML配置文件中加载上下文定义，把应用上下文的定义文件作为类资源。
- FileSystemXmlApplicationContext：从文件系统下的一个或多个XML配置文件中加载上下文定义。
- XmlWebApplicationContext：从Web应用下的一个或多个XML配置文件中加载上下文定义。

### bean的生命周期