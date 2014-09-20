/*  1:   */ import com.google.common.base.Predicate;
/*  2:   */ import java.util.Random;
/*  3:   */ 
/*  4:   */ public class bif
/*  5:   */   extends bhp
/*  6:   */ {
/*  7:   */   private final bec a;
/*  8:   */   private final int b;
/*  9:   */   private final Predicate c;
/* 10:   */   
/* 11:   */   public bif(bec parambec, int paramInt)
/* 12:   */   {
/* 13:20 */     this(parambec, paramInt, bep.a(aty.b));
/* 14:   */   }
/* 15:   */   
/* 16:   */   public bif(bec parambec, int paramInt, Predicate paramPredicate)
/* 17:   */   {
/* 18:24 */     this.a = parambec;
/* 19:25 */     this.b = paramInt;
/* 20:26 */     this.c = paramPredicate;
/* 21:   */   }
/* 22:   */   
/* 23:   */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/* 24:   */   {
/* 25:31 */     float f1 = paramRandom.nextFloat() * 3.141593F;
/* 26:   */     
/* 27:33 */     double d1 = paramdt.n() + 8 + uv.a(f1) * this.b / 8.0F;
/* 28:34 */     double d2 = paramdt.n() + 8 - uv.a(f1) * this.b / 8.0F;
/* 29:35 */     double d3 = paramdt.p() + 8 + uv.b(f1) * this.b / 8.0F;
/* 30:36 */     double d4 = paramdt.p() + 8 - uv.b(f1) * this.b / 8.0F;
/* 31:   */     
/* 32:38 */     double d5 = paramdt.o() + paramRandom.nextInt(3) - 2;
/* 33:39 */     double d6 = paramdt.o() + paramRandom.nextInt(3) - 2;
/* 34:41 */     for (int i = 0; i < this.b; i++)
/* 35:   */     {
/* 36:42 */       float f2 = i / this.b;
/* 37:43 */       double d7 = d1 + (d2 - d1) * f2;
/* 38:44 */       double d8 = d5 + (d6 - d5) * f2;
/* 39:45 */       double d9 = d3 + (d4 - d3) * f2;
/* 40:   */       
/* 41:47 */       double d10 = paramRandom.nextDouble() * this.b / 16.0D;
/* 42:48 */       double d11 = (uv.a(3.141593F * f2) + 1.0F) * d10 + 1.0D;
/* 43:49 */       double d12 = (uv.a(3.141593F * f2) + 1.0F) * d10 + 1.0D;
/* 44:   */       
/* 45:51 */       int j = uv.c(d7 - d11 / 2.0D);
/* 46:52 */       int k = uv.c(d8 - d12 / 2.0D);
/* 47:53 */       int m = uv.c(d9 - d11 / 2.0D);
/* 48:   */       
/* 49:55 */       int n = uv.c(d7 + d11 / 2.0D);
/* 50:56 */       int i1 = uv.c(d8 + d12 / 2.0D);
/* 51:57 */       int i2 = uv.c(d9 + d11 / 2.0D);
/* 52:59 */       for (int i3 = j; i3 <= n; i3++)
/* 53:   */       {
/* 54:60 */         double d13 = (i3 + 0.5D - d7) / (d11 / 2.0D);
/* 55:61 */         if (d13 * d13 < 1.0D) {
/* 56:62 */           for (int i4 = k; i4 <= i1; i4++)
/* 57:   */           {
/* 58:63 */             double d14 = (i4 + 0.5D - d8) / (d12 / 2.0D);
/* 59:64 */             if (d13 * d13 + d14 * d14 < 1.0D) {
/* 60:65 */               for (int i5 = m; i5 <= i2; i5++)
/* 61:   */               {
/* 62:66 */                 double d15 = (i5 + 0.5D - d9) / (d11 / 2.0D);
/* 63:67 */                 if (d13 * d13 + d14 * d14 + d15 * d15 < 1.0D)
/* 64:   */                 {
/* 65:68 */                   dt localdt = new dt(i3, i4, i5);
/* 66:69 */                   if (this.c.apply(paramaqu.p(localdt))) {
/* 67:70 */                     paramaqu.a(localdt, this.a, 2);
/* 68:   */                   }
/* 69:   */                 }
/* 70:   */               }
/* 71:   */             }
/* 72:   */           }
/* 73:   */         }
/* 74:   */       }
/* 75:   */     }
/* 76:80 */     return true;
/* 77:   */   }
/* 78:   */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bif
 * JD-Core Version:    0.7.0.1
 */