/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class avl
/*   4:    */   extends atr
/*   5:    */ {
/*   6:    */   public avl()
/*   7:    */   {
/*   8: 18 */     super(bof.D);
/*   9:    */     
/*  10: 20 */     a(0.0625F, 0.0F, 0.0625F, 0.9375F, 1.0F, 0.9375F);
/*  11:    */   }
/*  12:    */   
/*  13:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  14:    */   {
/*  15: 25 */     paramaqu.a(paramdt, this, a(paramaqu));
/*  16:    */   }
/*  17:    */   
/*  18:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  19:    */   {
/*  20: 30 */     paramaqu.a(paramdt, this, a(paramaqu));
/*  21:    */   }
/*  22:    */   
/*  23:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  24:    */   {
/*  25: 35 */     d(paramaqu, paramdt);
/*  26:    */   }
/*  27:    */   
/*  28:    */   private void d(aqu paramaqu, dt paramdt)
/*  29:    */   {
/*  30: 39 */     if ((!avt.d(paramaqu, paramdt.b())) || (paramdt.o() < 0)) {
/*  31: 40 */       return;
/*  32:    */     }
/*  33: 43 */     int i = 32;
/*  34: 44 */     if ((avt.M) || (!paramaqu.a(paramdt.a(-i, -i, -i), paramdt.a(i, i, i))))
/*  35:    */     {
/*  36: 45 */       paramaqu.g(paramdt);
/*  37:    */       
/*  38: 47 */       dt localdt = paramdt;
/*  39: 48 */       while ((avt.d(paramaqu, localdt)) && (localdt.o() > 0)) {
/*  40: 49 */         localdt = localdt.b();
/*  41:    */       }
/*  42: 51 */       if (localdt.o() > 0) {
/*  43: 52 */         paramaqu.a(localdt, P(), 2);
/*  44:    */       }
/*  45:    */     }
/*  46:    */     else
/*  47:    */     {
/*  48: 55 */       paramaqu.d(new adv(paramaqu, paramdt.n() + 0.5F, paramdt.o(), paramdt.p() + 0.5F, P()));
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  53:    */   {
/*  54: 61 */     e(paramaqu, paramdt);
/*  55: 62 */     return true;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public void a(aqu paramaqu, dt paramdt, ahd paramahd)
/*  59:    */   {
/*  60: 67 */     e(paramaqu, paramdt);
/*  61:    */   }
/*  62:    */   
/*  63:    */   private void e(aqu paramaqu, dt paramdt)
/*  64:    */   {
/*  65: 71 */     bec localbec = paramaqu.p(paramdt);
/*  66: 72 */     if (localbec.c() != this) {
/*  67: 73 */       return;
/*  68:    */     }
/*  69: 76 */     for (int i = 0; i < 1000; i++)
/*  70:    */     {
/*  71: 77 */       dt localdt = paramdt.a(paramaqu.s.nextInt(16) - paramaqu.s.nextInt(16), paramaqu.s.nextInt(8) - paramaqu.s.nextInt(8), paramaqu.s.nextInt(16) - paramaqu.s.nextInt(16));
/*  72: 78 */       if (paramaqu.p(localdt).c().J == bof.a)
/*  73:    */       {
/*  74: 79 */         if (paramaqu.D)
/*  75:    */         {
/*  76: 80 */           for (int j = 0; j < 128; j++)
/*  77:    */           {
/*  78: 81 */             double d1 = paramaqu.s.nextDouble();
/*  79: 82 */             float f1 = (paramaqu.s.nextFloat() - 0.5F) * 0.2F;
/*  80: 83 */             float f2 = (paramaqu.s.nextFloat() - 0.5F) * 0.2F;
/*  81: 84 */             float f3 = (paramaqu.s.nextFloat() - 0.5F) * 0.2F;
/*  82:    */             
/*  83: 86 */             double d2 = localdt.n() + (paramdt.n() - localdt.n()) * d1 + (paramaqu.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  84: 87 */             double d3 = localdt.o() + (paramdt.o() - localdt.o()) * d1 + paramaqu.s.nextDouble() * 1.0D - 0.5D;
/*  85: 88 */             double d4 = localdt.p() + (paramdt.p() - localdt.p()) * d1 + (paramaqu.s.nextDouble() - 0.5D) * 1.0D + 0.5D;
/*  86: 89 */             paramaqu.a(ew.y, d2, d3, d4, f1, f2, f3, new int[0]);
/*  87:    */           }
/*  88:    */         }
/*  89:    */         else
/*  90:    */         {
/*  91: 92 */           paramaqu.a(localdt, localbec, 2);
/*  92: 93 */           paramaqu.g(paramdt);
/*  93:    */         }
/*  94: 95 */         return;
/*  95:    */       }
/*  96:    */     }
/*  97:    */   }
/*  98:    */   
/*  99:    */   public int a(aqu paramaqu)
/* 100:    */   {
/* 101:102 */     return 5;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public boolean c()
/* 105:    */   {
/* 106:107 */     return false;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public boolean d()
/* 110:    */   {
/* 111:112 */     return false;
/* 112:    */   }
/* 113:    */   
/* 114:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/* 115:    */   {
/* 116:117 */     return true;
/* 117:    */   }
/* 118:    */   
/* 119:    */   public alq b(aqu paramaqu, dt paramdt)
/* 120:    */   {
/* 121:122 */     return null;
/* 122:    */   }
/* 123:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avl
 * JD-Core Version:    0.7.0.1
 */