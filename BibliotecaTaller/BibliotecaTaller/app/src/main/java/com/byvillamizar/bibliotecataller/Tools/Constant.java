package com.byvillamizar.bibliotecataller.Tools;

public class Constant {
    public  static  final String DATABASE_NAME = "libreria.db";
    public static final int DATABASE_VERSION = 1;

    public  static  final  String TABLE_ADMIN = "admin";
    public  static  final  String COLUMN_ADMIN_ID = "admin_id";
    public  static  final  String COLUMN_ADMIN_MAIL = "admin_mail";
    public  static  final  String COLUMN_ADMIN_PASSWORD = "admin_password";

    public static final String TABLE_USU ="t_usuario";
    public static final String COLUMN_IDUSU = "usu_id";
    public static final String COLUMN_NOMBREUSU= "usu_nombre";
    public static final String COLUMN_CORREOUSU= "usu_correo";
    public static final String COLUM_TELEFONOUSU= "usu_telefono";
    public static final String COLUMN_DIRECCIONUSU= "usu_direccion";
    public static final String COLUMN_CLAVEUSU= "usu_clave";

    public static final String TABLE_LIB ="t_libro";
    public static final String COLUMN_IDLIB= "lib_id";
    public static final String COLUMN_IDLIBUSU= "id_lib_usu";
    public static final String COLUMN_NOMBRELIB= "lib_nombre";
    public static final String COLUMN_AUTORLIB= "lib_autor";
    public static final String COLUMN_CANTLIB= "lib_cantidad";
    public static final String COLUMN_URLLIB= "lib_url";
    public static final String COLUMN_IMAGENLIB= "lib_imagen";
    public static final String COLUMN_DESCRIPLIB= "lib_descripcion";

    public static final String REGISTER_CORRESPONDENT = "Registrar Corresponsal";
    public static final String REGISTER_CORRESPONDENT_IMG = "https://cdn-icons-png.flaticon.com/512/2910/2910768.png";

    public static final String REGISTER_CLIENT = "Registrar Cliente";
    public static final String REGISTER_CLIENT_IMG = "https://cdn-icons-png.flaticon.com/512/3456/3456420.png";

    public static final String SHOW_CORRESPONDENT = " Mostrar Corresponsal ";
    public static final String SHOW_CORRESPONDENT_IMG = "https://cdn-icons-png.flaticon.com/512/2910/2910808.png";

    public static final String SHOW_CLIENT = "Mostrar Cliente";
    public static final String SHOW_CLIENT_IMG = "https://cdn-icons-png.flaticon.com/512/2910/2910787.png";
}
