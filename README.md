# Geometry
Implements 2D and 3D geometries as well.

2D:
- Rectangle
- Triangle
- Circle

3D:
- Triangular Prism
- Rectangular Prism
- Sphere

# How to run
1) Change dir to app
```
cd app
```
2) Build the package
```
mvn package -Dmaven.test.skip.exec=true
```
3) Run the app
```
java -cp target/app-1.0-SNAPSHOT.jar geometry.App 
```

NOTE: To test
```
mvn test
```