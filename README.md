# GoogleRoomDatebase
* <b>A demo for Room</b>



## 第一步  `build.gradle`
```
 dependencies {
     compile 'android.arch.persistence.room:runtime:+'
     annotationProcessor "android.arch.persistence.room:compiler:+"
 }
```
## 第二步 `build.gradle`  `javaCompileOptions`
```
javaCompileOptions {
    annotationProcessorOptions {
        arguments = ["room.schemaLocation":
            "$projectDir/schemas".toString()]
    }
}
```
## 第三步 `Entity`

  `编写 user实体类`
  
## 第四步 `Dao`

  `编写 dao`
  
## 第五步 `AppDatabase`

  `编写 AppDatabase类`
  
## 第六步 调用

```
val db = Room.databaseBuilder(applicationContext,
         AppDatabase::class.java!!, "user.db").build()
dao=db.userDao()
dao.delete()
dao.insertAll()
dao.getAll()
```
