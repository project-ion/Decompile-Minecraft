/*  1:   */ import org.lwjgl.opengl.GL11;
/*  2:   */ 
/*  3:   */ public class cpg
/*  4:   */   extends cpu
/*  5:   */ {
/*  6:13 */   private static final oa a = new oa("textures/entity/arrow.png");
/*  7:   */   
/*  8:   */   public cpg(cpt paramcpt)
/*  9:   */   {
/* 10:16 */     super(paramcpt);
/* 11:   */   }
/* 12:   */   
/* 13:   */   public void a(ahj paramahj, double paramDouble1, double paramDouble2, double paramDouble3, float paramFloat1, float paramFloat2)
/* 14:   */   {
/* 15:21 */     c(paramahj);
/* 16:   */     
/* 17:23 */     cjm.c(1.0F, 1.0F, 1.0F, 1.0F);
/* 18:24 */     cjm.E();
/* 19:   */     
/* 20:26 */     cjm.b((float)paramDouble1, (float)paramDouble2, (float)paramDouble3);
/* 21:27 */     cjm.b(paramahj.A + (paramahj.y - paramahj.A) * paramFloat2 - 90.0F, 0.0F, 1.0F, 0.0F);
/* 22:28 */     cjm.b(paramahj.B + (paramahj.z - paramahj.B) * paramFloat2, 0.0F, 0.0F, 1.0F);
/* 23:   */     
/* 24:30 */     ckx localckx = ckx.a();
/* 25:31 */     civ localciv = localckx.c();
/* 26:   */     
/* 27:33 */     int i = 0;
/* 28:   */     
/* 29:35 */     float f1 = 0.0F;
/* 30:36 */     float f2 = 0.5F;
/* 31:37 */     float f3 = (0 + i * 10) / 32.0F;
/* 32:38 */     float f4 = (5 + i * 10) / 32.0F;
/* 33:   */     
/* 34:40 */     float f5 = 0.0F;
/* 35:41 */     float f6 = 0.15625F;
/* 36:42 */     float f7 = (5 + i * 10) / 32.0F;
/* 37:43 */     float f8 = (10 + i * 10) / 32.0F;
/* 38:44 */     float f9 = 0.05625F;
/* 39:45 */     cjm.B();
/* 40:46 */     float f10 = paramahj.b - paramFloat2;
/* 41:47 */     if (f10 > 0.0F)
/* 42:   */     {
/* 43:48 */       float f11 = -uv.a(f10 * 3.0F) * f10;
/* 44:49 */       cjm.b(f11, 0.0F, 0.0F, 1.0F);
/* 45:   */     }
/* 46:51 */     cjm.b(45.0F, 1.0F, 0.0F, 0.0F);
/* 47:52 */     cjm.a(f9, f9, f9);
/* 48:   */     
/* 49:54 */     cjm.b(-4.0F, 0.0F, 0.0F);
/* 50:   */     
/* 51:56 */     GL11.glNormal3f(f9, 0.0F, 0.0F);
/* 52:57 */     localciv.b();
/* 53:58 */     localciv.a(-7.0D, -2.0D, -2.0D, f5, f7);
/* 54:59 */     localciv.a(-7.0D, -2.0D, 2.0D, f6, f7);
/* 55:60 */     localciv.a(-7.0D, 2.0D, 2.0D, f6, f8);
/* 56:61 */     localciv.a(-7.0D, 2.0D, -2.0D, f5, f8);
/* 57:62 */     localckx.b();
/* 58:   */     
/* 59:64 */     GL11.glNormal3f(-f9, 0.0F, 0.0F);
/* 60:65 */     localciv.b();
/* 61:66 */     localciv.a(-7.0D, 2.0D, -2.0D, f5, f7);
/* 62:67 */     localciv.a(-7.0D, 2.0D, 2.0D, f6, f7);
/* 63:68 */     localciv.a(-7.0D, -2.0D, 2.0D, f6, f8);
/* 64:69 */     localciv.a(-7.0D, -2.0D, -2.0D, f5, f8);
/* 65:70 */     localckx.b();
/* 66:72 */     for (int j = 0; j < 4; j++)
/* 67:   */     {
/* 68:73 */       cjm.b(90.0F, 1.0F, 0.0F, 0.0F);
/* 69:74 */       GL11.glNormal3f(0.0F, 0.0F, f9);
/* 70:75 */       localciv.b();
/* 71:76 */       localciv.a(-8.0D, -2.0D, 0.0D, f1, f3);
/* 72:77 */       localciv.a(8.0D, -2.0D, 0.0D, f2, f3);
/* 73:78 */       localciv.a(8.0D, 2.0D, 0.0D, f2, f4);
/* 74:79 */       localciv.a(-8.0D, 2.0D, 0.0D, f1, f4);
/* 75:80 */       localckx.b();
/* 76:   */     }
/* 77:83 */     cjm.C();
/* 78:84 */     cjm.F();
/* 79:   */     
/* 80:86 */     super.a(paramahj, paramDouble1, paramDouble2, paramDouble3, paramFloat1, paramFloat2);
/* 81:   */   }
/* 82:   */   
/* 83:   */   protected oa a(ahj paramahj)
/* 84:   */   {
/* 85:91 */     return a;
/* 86:   */   }
/* 87:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     cpg
 * JD-Core Version:    0.7.0.1
 */