/*  1:   */ package net.minecraft.realms;
/*  2:   */ 
/*  3:   */ import civ;
/*  4:   */ import cix;
/*  5:   */ import ckx;
/*  6:   */ 
/*  7:   */ public class Tezzelator
/*  8:   */ {
/*  9: 7 */   public static ckx t = ;
/* 10: 9 */   public static final Tezzelator instance = new Tezzelator();
/* 11:   */   
/* 12:   */   public int end()
/* 13:   */   {
/* 14:12 */     return t.b();
/* 15:   */   }
/* 16:   */   
/* 17:   */   public void vertex(double paramDouble1, double paramDouble2, double paramDouble3)
/* 18:   */   {
/* 19:16 */     t.c().b(paramDouble1, paramDouble2, paramDouble3);
/* 20:   */   }
/* 21:   */   
/* 22:   */   public void color(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
/* 23:   */   {
/* 24:20 */     t.c().a(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/* 25:   */   }
/* 26:   */   
/* 27:   */   public void color(int paramInt1, int paramInt2, int paramInt3)
/* 28:   */   {
/* 29:24 */     t.c().a(paramInt1, paramInt2, paramInt3);
/* 30:   */   }
/* 31:   */   
/* 32:   */   public void tex2(int paramInt)
/* 33:   */   {
/* 34:28 */     t.c().b(paramInt);
/* 35:   */   }
/* 36:   */   
/* 37:   */   public void normal(float paramFloat1, float paramFloat2, float paramFloat3)
/* 38:   */   {
/* 39:32 */     t.c().d(paramFloat1, paramFloat2, paramFloat3);
/* 40:   */   }
/* 41:   */   
/* 42:   */   public void noColor()
/* 43:   */   {
/* 44:36 */     t.c().c();
/* 45:   */   }
/* 46:   */   
/* 47:   */   public void color(int paramInt)
/* 48:   */   {
/* 49:40 */     t.c().c(paramInt);
/* 50:   */   }
/* 51:   */   
/* 52:   */   public void color(float paramFloat1, float paramFloat2, float paramFloat3)
/* 53:   */   {
/* 54:44 */     t.c().b(paramFloat1, paramFloat2, paramFloat3);
/* 55:   */   }
/* 56:   */   
/* 57:   */   public cix sortQuads(float paramFloat1, float paramFloat2, float paramFloat3)
/* 58:   */   {
/* 59:48 */     return t.c().a(paramFloat1, paramFloat2, paramFloat3);
/* 60:   */   }
/* 61:   */   
/* 62:   */   public void restoreState(cix paramcix)
/* 63:   */   {
/* 64:52 */     t.c().a(paramcix);
/* 65:   */   }
/* 66:   */   
/* 67:   */   public void begin(int paramInt)
/* 68:   */   {
/* 69:56 */     t.c().a(paramInt);
/* 70:   */   }
/* 71:   */   
/* 72:   */   public void begin()
/* 73:   */   {
/* 74:60 */     t.c().b();
/* 75:   */   }
/* 76:   */   
/* 77:   */   public void vertexUV(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4, double paramDouble5)
/* 78:   */   {
/* 79:64 */     t.c().a(paramDouble1, paramDouble2, paramDouble3, paramDouble4, paramDouble5);
/* 80:   */   }
/* 81:   */   
/* 82:   */   public void color(int paramInt1, int paramInt2)
/* 83:   */   {
/* 84:68 */     t.c().a(paramInt1, paramInt2);
/* 85:   */   }
/* 86:   */   
/* 87:   */   public void offset(double paramDouble1, double paramDouble2, double paramDouble3)
/* 88:   */   {
/* 89:72 */     t.c().c(paramDouble1, paramDouble2, paramDouble3);
/* 90:   */   }
/* 91:   */   
/* 92:   */   public void color(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/* 93:   */   {
/* 94:76 */     t.c().b(paramInt1, paramInt2, paramInt3, paramInt4);
/* 95:   */   }
/* 96:   */   
/* 97:   */   public void tex(double paramDouble1, double paramDouble2)
/* 98:   */   {
/* 99:80 */     t.c().a(paramDouble1, paramDouble2);
/* :0:   */   }
/* :1:   */   
/* :2:   */   public void color(byte paramByte1, byte paramByte2, byte paramByte3)
/* :3:   */   {
/* :4:84 */     t.c().a(paramByte1, paramByte2, paramByte3);
/* :5:   */   }
/* :6:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     net.minecraft.realms.Tezzelator
 * JD-Core Version:    0.7.0.1
 */