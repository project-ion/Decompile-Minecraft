/*  1:   */ import com.google.common.collect.Multimap;
/*  2:   */ import java.util.Set;
/*  3:   */ 
/*  4:   */ public class aks
/*  5:   */   extends alq
/*  6:   */ {
/*  7:   */   private Set c;
/*  8:15 */   protected float a = 4.0F;
/*  9:   */   private float d;
/* 10:   */   protected ami b;
/* 11:   */   
/* 12:   */   protected aks(float paramFloat, ami paramami, Set paramSet)
/* 13:   */   {
/* 14:21 */     this.b = paramami;
/* 15:22 */     this.c = paramSet;
/* 16:23 */     this.h = 1;
/* 17:24 */     d(paramami.a());
/* 18:25 */     this.a = paramami.b();
/* 19:26 */     this.d = (paramFloat + paramami.c());
/* 20:27 */     a(akf.i);
/* 21:   */   }
/* 22:   */   
/* 23:   */   public float a(amj paramamj, atr paramatr)
/* 24:   */   {
/* 25:32 */     return this.c.contains(paramatr) ? this.a : 1.0F;
/* 26:   */   }
/* 27:   */   
/* 28:   */   public boolean a(amj paramamj, xm paramxm1, xm paramxm2)
/* 29:   */   {
/* 30:37 */     paramamj.a(2, paramxm2);
/* 31:38 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public boolean a(amj paramamj, aqu paramaqu, atr paramatr, dt paramdt, xm paramxm)
/* 35:   */   {
/* 36:44 */     if (paramatr.g(paramaqu, paramdt) != 0.0D) {
/* 37:45 */       paramamj.a(1, paramxm);
/* 38:   */     }
/* 39:47 */     return true;
/* 40:   */   }
/* 41:   */   
/* 42:   */   public boolean v_()
/* 43:   */   {
/* 44:52 */     return true;
/* 45:   */   }
/* 46:   */   
/* 47:   */   public ami g()
/* 48:   */   {
/* 49:56 */     return this.b;
/* 50:   */   }
/* 51:   */   
/* 52:   */   public int b()
/* 53:   */   {
/* 54:61 */     return this.b.e();
/* 55:   */   }
/* 56:   */   
/* 57:   */   public String h()
/* 58:   */   {
/* 59:65 */     return this.b.toString();
/* 60:   */   }
/* 61:   */   
/* 62:   */   public boolean a(amj paramamj1, amj paramamj2)
/* 63:   */   {
/* 64:70 */     if (this.b.f() == paramamj2.b()) {
/* 65:71 */       return true;
/* 66:   */     }
/* 67:73 */     return super.a(paramamj1, paramamj2);
/* 68:   */   }
/* 69:   */   
/* 70:   */   public Multimap i()
/* 71:   */   {
/* 72:78 */     Multimap localMultimap = super.i();
/* 73:   */     
/* 74:80 */     localMultimap.put(afs.e.a(), new ya(f, "Tool modifier", this.d, 0));
/* 75:   */     
/* 76:82 */     return localMultimap;
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aks
 * JD-Core Version:    0.7.0.1
 */