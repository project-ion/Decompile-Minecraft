/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class all
/*  4:   */   extends alq
/*  5:   */ {
/*  6:11 */   public final int a = 32;
/*  7:   */   private final int b;
/*  8:   */   private final float c;
/*  9:   */   private final boolean d;
/* 10:   */   private boolean k;
/* 11:   */   private int l;
/* 12:   */   private int m;
/* 13:   */   private int n;
/* 14:   */   private float o;
/* 15:   */   
/* 16:   */   public all(int paramInt, float paramFloat, boolean paramBoolean)
/* 17:   */   {
/* 18:24 */     this.b = paramInt;
/* 19:25 */     this.d = paramBoolean;
/* 20:26 */     this.c = paramFloat;
/* 21:27 */     a(akf.h);
/* 22:   */   }
/* 23:   */   
/* 24:   */   public all(int paramInt, boolean paramBoolean)
/* 25:   */   {
/* 26:31 */     this(paramInt, 0.6F, paramBoolean);
/* 27:   */   }
/* 28:   */   
/* 29:   */   public amj b(amj paramamj, aqu paramaqu, ahd paramahd)
/* 30:   */   {
/* 31:36 */     paramamj.b -= 1;
/* 32:37 */     paramahd.ck().a(this, paramamj);
/* 33:38 */     paramaqu.a(paramahd, "random.burp", 0.5F, paramaqu.s.nextFloat() * 0.1F + 0.9F);
/* 34:   */     
/* 35:40 */     c(paramamj, paramaqu, paramahd);
/* 36:41 */     paramahd.b(ty.J[alq.b(this)]);
/* 37:   */     
/* 38:43 */     return paramamj;
/* 39:   */   }
/* 40:   */   
/* 41:   */   protected void c(amj paramamj, aqu paramaqu, ahd paramahd)
/* 42:   */   {
/* 43:47 */     if ((!paramaqu.D) && (this.l > 0) && (paramaqu.s.nextFloat() < this.o)) {
/* 44:48 */       paramahd.c(new wq(this.l, this.m * 20, this.n));
/* 45:   */     }
/* 46:   */   }
/* 47:   */   
/* 48:   */   public int d(amj paramamj)
/* 49:   */   {
/* 50:54 */     return 32;
/* 51:   */   }
/* 52:   */   
/* 53:   */   public ano e(amj paramamj)
/* 54:   */   {
/* 55:59 */     return ano.b;
/* 56:   */   }
/* 57:   */   
/* 58:   */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 59:   */   {
/* 60:64 */     if (paramahd.j(this.k)) {
/* 61:65 */       paramahd.a(paramamj, d(paramamj));
/* 62:   */     }
/* 63:67 */     return paramamj;
/* 64:   */   }
/* 65:   */   
/* 66:   */   public int h(amj paramamj)
/* 67:   */   {
/* 68:71 */     return this.b;
/* 69:   */   }
/* 70:   */   
/* 71:   */   public float i(amj paramamj)
/* 72:   */   {
/* 73:75 */     return this.c;
/* 74:   */   }
/* 75:   */   
/* 76:   */   public boolean g()
/* 77:   */   {
/* 78:79 */     return this.d;
/* 79:   */   }
/* 80:   */   
/* 81:   */   public all a(int paramInt1, int paramInt2, int paramInt3, float paramFloat)
/* 82:   */   {
/* 83:83 */     this.l = paramInt1;
/* 84:84 */     this.m = paramInt2;
/* 85:85 */     this.n = paramInt3;
/* 86:86 */     this.o = paramFloat;
/* 87:87 */     return this;
/* 88:   */   }
/* 89:   */   
/* 90:   */   public all h()
/* 91:   */   {
/* 92:91 */     this.k = true;
/* 93:92 */     return this;
/* 94:   */   }
/* 95:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     all
 * JD-Core Version:    0.7.0.1
 */