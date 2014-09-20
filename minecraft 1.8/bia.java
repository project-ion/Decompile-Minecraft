/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bia
/*   4:    */   extends bic
/*   5:    */ {
/*   6:    */   public bia(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
/*   7:    */   {
/*   8: 14 */     super(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean b(aqu paramaqu, Random paramRandom, dt paramdt)
/*  12:    */   {
/*  13: 19 */     int i = a(paramRandom);
/*  14: 20 */     if (!a(paramaqu, paramRandom, paramdt, i)) {
/*  15: 21 */       return false;
/*  16:    */     }
/*  17: 24 */     c(paramaqu, paramdt.b(i), 2);
/*  18:    */     
/*  19: 26 */     int j = paramdt.o() + i - 2 - paramRandom.nextInt(4);
/*  20: 29 */     while (j > paramdt.o() + i / 2)
/*  21:    */     {
/*  22: 30 */       float f = paramRandom.nextFloat() * 3.141593F * 2.0F;
/*  23: 31 */       int m = paramdt.n() + (int)(0.5F + uv.b(f) * 4.0F);
/*  24: 32 */       int n = paramdt.p() + (int)(0.5F + uv.a(f) * 4.0F);
/*  25: 34 */       for (int i1 = 0; i1 < 5; i1++)
/*  26:    */       {
/*  27: 35 */         m = paramdt.n() + (int)(1.5F + uv.b(f) * i1);
/*  28: 36 */         n = paramdt.p() + (int)(1.5F + uv.a(f) * i1);
/*  29: 37 */         a(paramaqu, new dt(m, j - 3 + i1 / 2, n), aty.r, this.b);
/*  30:    */       }
/*  31: 39 */       i1 = 1 + paramRandom.nextInt(2);
/*  32: 40 */       int i2 = j;
/*  33: 41 */       for (int i3 = i2 - i1; i3 <= i2; i3++)
/*  34:    */       {
/*  35: 42 */         int i4 = i3 - i2;
/*  36: 43 */         b(paramaqu, new dt(m, i3, n), 1 - i4);
/*  37:    */       }
/*  38: 46 */       j -= 2 + paramRandom.nextInt(4);
/*  39:    */     }
/*  40: 49 */     for (int k = 0; k < i; k++)
/*  41:    */     {
/*  42: 50 */       dt localdt1 = paramdt.b(k);
/*  43: 51 */       if (a(paramaqu.p(localdt1).c().r()))
/*  44:    */       {
/*  45: 52 */         a(paramaqu, localdt1, aty.r, this.b);
/*  46: 53 */         if (k > 0)
/*  47:    */         {
/*  48: 54 */           b(paramaqu, paramRandom, localdt1.e(), bbv.S);
/*  49: 55 */           b(paramaqu, paramRandom, localdt1.c(), bbv.Q);
/*  50:    */         }
/*  51:    */       }
/*  52: 59 */       if (k < i - 1)
/*  53:    */       {
/*  54: 60 */         dt localdt2 = localdt1.f();
/*  55: 61 */         if (a(paramaqu.p(localdt2).c().r()))
/*  56:    */         {
/*  57: 62 */           a(paramaqu, localdt2, aty.r, this.b);
/*  58: 63 */           if (k > 0)
/*  59:    */           {
/*  60: 64 */             b(paramaqu, paramRandom, localdt2.f(), bbv.T);
/*  61: 65 */             b(paramaqu, paramRandom, localdt2.c(), bbv.Q);
/*  62:    */           }
/*  63:    */         }
/*  64: 69 */         dt localdt3 = localdt1.d().f();
/*  65: 70 */         if (a(paramaqu.p(localdt3).c().r()))
/*  66:    */         {
/*  67: 71 */           a(paramaqu, localdt3, aty.r, this.b);
/*  68: 72 */           if (k > 0)
/*  69:    */           {
/*  70: 73 */             b(paramaqu, paramRandom, localdt3.f(), bbv.T);
/*  71: 74 */             b(paramaqu, paramRandom, localdt3.d(), bbv.R);
/*  72:    */           }
/*  73:    */         }
/*  74: 78 */         dt localdt4 = localdt1.d();
/*  75: 79 */         if (a(paramaqu.p(localdt4).c().r()))
/*  76:    */         {
/*  77: 80 */           a(paramaqu, localdt4, aty.r, this.b);
/*  78: 81 */           if (k > 0)
/*  79:    */           {
/*  80: 82 */             b(paramaqu, paramRandom, localdt4.e(), bbv.S);
/*  81: 83 */             b(paramaqu, paramRandom, localdt4.d(), bbv.R);
/*  82:    */           }
/*  83:    */         }
/*  84:    */       }
/*  85:    */     }
/*  86: 89 */     return true;
/*  87:    */   }
/*  88:    */   
/*  89:    */   private boolean a(bof parambof)
/*  90:    */   {
/*  91: 93 */     return (parambof == bof.a) || (parambof == bof.j);
/*  92:    */   }
/*  93:    */   
/*  94:    */   private void b(aqu paramaqu, Random paramRandom, dt paramdt, int paramInt)
/*  95:    */   {
/*  96: 97 */     if ((paramRandom.nextInt(3) > 0) && (paramaqu.d(paramdt))) {
/*  97: 98 */       a(paramaqu, paramdt, aty.bn, paramInt);
/*  98:    */     }
/*  99:    */   }
/* 100:    */   
/* 101:    */   private void c(aqu paramaqu, dt paramdt, int paramInt)
/* 102:    */   {
/* 103:103 */     int i = 2;
/* 104:104 */     for (int j = -i; j <= 0; j++) {
/* 105:105 */       a(paramaqu, paramdt.b(j), paramInt + 1 - j);
/* 106:    */     }
/* 107:    */   }
/* 108:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bia
 * JD-Core Version:    0.7.0.1
 */