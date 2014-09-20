/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bib
/*   4:    */   extends bic
/*   5:    */ {
/*   6:    */   private boolean e;
/*   7:    */   
/*   8:    */   public bib(boolean paramBoolean1, boolean paramBoolean2)
/*   9:    */   {
/*  10: 18 */     super(paramBoolean1, 13, 15, ayx.b.a(), ayx.b.a());
/*  11: 19 */     this.e = paramBoolean2;
/*  12:    */   }
/*  13:    */   
/*  14:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  15:    */   {
/*  16: 24 */     int i = a(paramRandom);
/*  17: 25 */     if (!a(paramaqu, paramRandom, paramdt, i)) {
/*  18: 26 */       return false;
/*  19:    */     }
/*  20: 29 */     a(paramaqu, paramdt.n(), paramdt.p(), paramdt.o() + i, 0, paramRandom);
/*  21: 31 */     for (int j = 0; j < i; j++)
/*  22:    */     {
/*  23: 32 */       atr localatr = paramaqu.p(paramdt.b(j)).c();
/*  24: 33 */       if ((localatr.r() == bof.a) || (localatr.r() == bof.j)) {
/*  25: 34 */         a(paramaqu, paramdt.b(j), aty.r, this.b);
/*  26:    */       }
/*  27: 36 */       if (j < i - 1)
/*  28:    */       {
/*  29: 37 */         localatr = paramaqu.p(paramdt.a(1, j, 0)).c();
/*  30: 38 */         if ((localatr.r() == bof.a) || (localatr.r() == bof.j)) {
/*  31: 39 */           a(paramaqu, paramdt.a(1, j, 0), aty.r, this.b);
/*  32:    */         }
/*  33: 41 */         localatr = paramaqu.p(paramdt.a(1, j, 1)).c();
/*  34: 42 */         if ((localatr.r() == bof.a) || (localatr.r() == bof.j)) {
/*  35: 43 */           a(paramaqu, paramdt.a(1, j, 1), aty.r, this.b);
/*  36:    */         }
/*  37: 45 */         localatr = paramaqu.p(paramdt.a(0, j, 1)).c();
/*  38: 46 */         if ((localatr.r() == bof.a) || (localatr.r() == bof.j)) {
/*  39: 47 */           a(paramaqu, paramdt.a(0, j, 1), aty.r, this.b);
/*  40:    */         }
/*  41:    */       }
/*  42:    */     }
/*  43: 52 */     return true;
/*  44:    */   }
/*  45:    */   
/*  46:    */   private void a(aqu paramaqu, int paramInt1, int paramInt2, int paramInt3, int paramInt4, Random paramRandom)
/*  47:    */   {
/*  48: 56 */     int i = paramRandom.nextInt(5) + (this.e ? this.a : 3);
/*  49:    */     
/*  50: 58 */     int j = 0;
/*  51: 59 */     for (int k = paramInt3 - i; k <= paramInt3; k++)
/*  52:    */     {
/*  53: 60 */       int m = paramInt3 - k;
/*  54: 61 */       int n = paramInt4 + uv.d(m / i * 3.5F);
/*  55: 62 */       a(paramaqu, new dt(paramInt1, k, paramInt2), n + ((m > 0) && (n == j) && ((k & 0x1) == 0) ? 1 : 0));
/*  56: 63 */       j = n;
/*  57:    */     }
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(aqu paramaqu, Random paramRandom, dt paramdt)
/*  61:    */   {
/*  62: 69 */     b(paramaqu, paramdt.e().c());
/*  63: 70 */     b(paramaqu, paramdt.g(2).c());
/*  64: 71 */     b(paramaqu, paramdt.e().e(2));
/*  65: 72 */     b(paramaqu, paramdt.g(2).e(2));
/*  66: 74 */     for (int i = 0; i < 5; i++)
/*  67:    */     {
/*  68: 75 */       int j = paramRandom.nextInt(64);
/*  69: 76 */       int k = j % 8;
/*  70: 77 */       int m = j / 8;
/*  71: 78 */       if ((k == 0) || (k == 7) || (m == 0) || (m == 7)) {
/*  72: 79 */         b(paramaqu, paramdt.a(-3 + k, 0, -3 + m));
/*  73:    */       }
/*  74:    */     }
/*  75:    */   }
/*  76:    */   
/*  77:    */   private void b(aqu paramaqu, dt paramdt)
/*  78:    */   {
/*  79: 85 */     for (int i = -2; i <= 2; i++) {
/*  80: 86 */       for (int j = -2; j <= 2; j++) {
/*  81: 87 */         if ((Math.abs(i) != 2) || (Math.abs(j) != 2)) {
/*  82: 88 */           c(paramaqu, paramdt.a(i, 0, j));
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86:    */   }
/*  87:    */   
/*  88:    */   private void c(aqu paramaqu, dt paramdt)
/*  89:    */   {
/*  90: 95 */     for (int i = 2; i >= -3; i--)
/*  91:    */     {
/*  92: 96 */       dt localdt = paramdt.b(i);
/*  93: 97 */       atr localatr = paramaqu.p(localdt).c();
/*  94: 98 */       if ((localatr == aty.c) || (localatr == aty.d)) {
/*  95: 99 */         a(paramaqu, localdt, aty.d, avd.c.a());
/*  96:    */       } else {
/*  97:101 */         if ((localatr.r() != bof.a) && (i < 0)) {
/*  98:    */           break;
/*  99:    */         }
/* 100:    */       }
/* 101:    */     }
/* 102:    */   }
/* 103:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bib
 * JD-Core Version:    0.7.0.1
 */