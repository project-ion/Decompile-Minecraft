/*  1:   */ import java.util.Random;
/*  2:   */ 
/*  3:   */ public class aac
/*  4:   */   extends zb
/*  5:   */ {
/*  6:   */   private abt a;
/*  7:   */   private double b;
/*  8:   */   private double c;
/*  9:   */   private double d;
/* 10:   */   private double e;
/* 11:   */   
/* 12:   */   public aac(abt paramabt, double paramDouble)
/* 13:   */   {
/* 14:16 */     this.a = paramabt;
/* 15:17 */     this.b = paramDouble;
/* 16:18 */     a(1);
/* 17:   */   }
/* 18:   */   
/* 19:   */   public boolean a()
/* 20:   */   {
/* 21:23 */     if ((this.a.cm()) || (this.a.l == null)) {
/* 22:24 */       return false;
/* 23:   */     }
/* 24:26 */     brw localbrw = abf.a(this.a, 5, 4);
/* 25:27 */     if (localbrw == null) {
/* 26:28 */       return false;
/* 27:   */     }
/* 28:30 */     this.c = localbrw.a;
/* 29:31 */     this.d = localbrw.b;
/* 30:32 */     this.e = localbrw.c;
/* 31:33 */     return true;
/* 32:   */   }
/* 33:   */   
/* 34:   */   public void c()
/* 35:   */   {
/* 36:38 */     this.a.s().a(this.c, this.d, this.e, this.b);
/* 37:   */   }
/* 38:   */   
/* 39:   */   public boolean b()
/* 40:   */   {
/* 41:43 */     return (!this.a.s().m()) && (this.a.l != null);
/* 42:   */   }
/* 43:   */   
/* 44:   */   public void e()
/* 45:   */   {
/* 46:48 */     if (this.a.bb().nextInt(50) == 0)
/* 47:   */     {
/* 48:49 */       if ((this.a.l instanceof ahd))
/* 49:   */       {
/* 50:50 */         int i = this.a.cA();
/* 51:51 */         int j = this.a.cG();
/* 52:52 */         if ((j > 0) && (this.a.bb().nextInt(j) < i))
/* 53:   */         {
/* 54:53 */           this.a.h((ahd)this.a.l);
/* 55:54 */           this.a.o.a(this.a, (byte)7);
/* 56:55 */           return;
/* 57:   */         }
/* 58:57 */         this.a.u(5);
/* 59:   */       }
/* 60:60 */       this.a.l.a(null);
/* 61:61 */       this.a.l = null;
/* 62:62 */       this.a.cU();
/* 63:63 */       this.a.o.a(this.a, (byte)6);
/* 64:   */     }
/* 65:   */   }
/* 66:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aac
 * JD-Core Version:    0.7.0.1
 */