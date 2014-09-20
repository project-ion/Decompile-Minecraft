/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class alb
/*   4:    */   extends alq
/*   5:    */ {
/*   6:    */   public alb()
/*   7:    */   {
/*   8: 20 */     a(akf.f);
/*   9:    */   }
/*  10:    */   
/*  11:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  12:    */   {
/*  13: 25 */     bec localbec1 = paramaqu.p(paramdt);
/*  14: 27 */     if ((paramahd.a(paramdt.a(paramej), paramej, paramamj)) && (localbec1.c() == aty.bG) && (!((Boolean)localbec1.b(avq.b)).booleanValue()))
/*  15:    */     {
/*  16: 28 */       if (paramaqu.D) {
/*  17: 29 */         return true;
/*  18:    */       }
/*  19: 31 */       paramaqu.a(paramdt, localbec1.a(avq.b, Boolean.valueOf(true)), 2);
/*  20: 32 */       paramaqu.e(paramdt, aty.bG);
/*  21: 33 */       paramamj.b -= 1;
/*  22: 35 */       for (int i = 0; i < 16; i++)
/*  23:    */       {
/*  24: 36 */         double d1 = paramdt.n() + (5.0F + g.nextFloat() * 6.0F) / 16.0F;
/*  25: 37 */         double d2 = paramdt.o() + 0.8125F;
/*  26: 38 */         double d3 = paramdt.p() + (5.0F + g.nextFloat() * 6.0F) / 16.0F;
/*  27: 39 */         double d4 = 0.0D;
/*  28: 40 */         double d5 = 0.0D;
/*  29: 41 */         double d6 = 0.0D;
/*  30:    */         
/*  31: 43 */         paramaqu.a(ew.l, d1, d2, d3, d4, d5, d6, new int[0]);
/*  32:    */       }
/*  33: 47 */       ej localej1 = (ej)localbec1.b(avq.a);
/*  34:    */       
/*  35:    */ 
/*  36: 50 */       dt localdt1 = 0;
/*  37: 51 */       dt localdt2 = 0;
/*  38: 52 */       int j = 0;
/*  39: 53 */       int k = 1;
/*  40: 54 */       ej localej2 = localej1.e();
/*  41:    */       dt localdt5;
/*  42:    */       Object localObject1;
/*  43: 55 */       for (dt localdt3 = -2; localdt3 <= 2; localdt3++)
/*  44:    */       {
/*  45: 56 */         localdt5 = paramdt.a(localej2, localdt3);
/*  46: 57 */         localObject1 = paramaqu.p(localdt5);
/*  47: 59 */         if (((bec)localObject1).c() == aty.bG)
/*  48:    */         {
/*  49: 60 */           if (!((Boolean)((bec)localObject1).b(avq.b)).booleanValue())
/*  50:    */           {
/*  51: 61 */             k = 0;
/*  52: 62 */             break;
/*  53:    */           }
/*  54: 64 */           localdt2 = localdt3;
/*  55: 65 */           if (j == 0)
/*  56:    */           {
/*  57: 66 */             localdt1 = localdt3;
/*  58: 67 */             j = 1;
/*  59:    */           }
/*  60:    */         }
/*  61:    */       }
/*  62: 73 */       if ((k != 0) && (localdt2 == localdt1 + 2))
/*  63:    */       {
/*  64: 75 */         dt localdt4 = paramdt.a(localej1, 4);
/*  65:    */         Object localObject2;
/*  66: 76 */         for (localdt5 = localdt1; localdt5 <= localdt2; localdt5++)
/*  67:    */         {
/*  68: 77 */           localObject1 = localdt4.a(localej2, localdt5);
/*  69: 78 */           localObject2 = paramaqu.p((dt)localObject1);
/*  70: 80 */           if ((((bec)localObject2).c() != aty.bG) || (!((Boolean)((bec)localObject2).b(avq.b)).booleanValue()))
/*  71:    */           {
/*  72: 81 */             k = 0;
/*  73: 82 */             break;
/*  74:    */           }
/*  75:    */         }
/*  76:    */         int m;
/*  77: 87 */         for (dt localdt6 = localdt1 - 1; localdt6 <= localdt2 + 1; localdt6 += 4)
/*  78:    */         {
/*  79: 88 */           localdt4 = paramdt.a(localej2, localdt6);
/*  80: 89 */           for (m = 1; m <= 3; m++)
/*  81:    */           {
/*  82: 90 */             localObject2 = localdt4.a(localej1, m);
/*  83: 91 */             bec localbec2 = paramaqu.p((dt)localObject2);
/*  84: 93 */             if ((localbec2.c() != aty.bG) || (!((Boolean)localbec2.b(avq.b)).booleanValue()))
/*  85:    */             {
/*  86: 94 */               k = 0;
/*  87: 95 */               break;
/*  88:    */             }
/*  89:    */           }
/*  90:    */         }
/*  91: 99 */         if (k != 0) {
/*  92:101 */           for (localdt6 = localdt1; localdt6 <= localdt2; localdt6++)
/*  93:    */           {
/*  94:102 */             localdt4 = paramdt.a(localej2, localdt6);
/*  95:103 */             for (m = 1; m <= 3; m++)
/*  96:    */             {
/*  97:104 */               localObject2 = localdt4.a(localej1, m);
/*  98:    */               
/*  99:106 */               paramaqu.a((dt)localObject2, aty.bF.P(), 2);
/* 100:    */             }
/* 101:    */           }
/* 102:    */         }
/* 103:    */       }
/* 104:112 */       return true;
/* 105:    */     }
/* 106:114 */     return false;
/* 107:    */   }
/* 108:    */   
/* 109:    */   public amj a(amj paramamj, aqu paramaqu, ahd paramahd)
/* 110:    */   {
/* 111:119 */     bru localbru = a(paramaqu, paramahd, false);
/* 112:120 */     if ((localbru != null) && (localbru.a == brv.b) && 
/* 113:121 */       (paramaqu.p(localbru.a()).c() == aty.bG)) {
/* 114:122 */       return paramamj;
/* 115:    */     }
/* 116:126 */     if (!paramaqu.D)
/* 117:    */     {
/* 118:127 */       dt localdt = paramaqu.a("Stronghold", new dt(paramahd));
/* 119:128 */       if (localdt != null)
/* 120:    */       {
/* 121:129 */         ahk localahk = new ahk(paramaqu, paramahd.s, paramahd.t, paramahd.u);
/* 122:130 */         localahk.a(localdt);
/* 123:131 */         paramaqu.d(localahk);
/* 124:    */         
/* 125:133 */         paramaqu.a(paramahd, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
/* 126:134 */         paramaqu.a(null, 1002, new dt(paramahd), 0);
/* 127:135 */         if (!paramahd.by.d) {
/* 128:136 */           paramamj.b -= 1;
/* 129:    */         }
/* 130:138 */         paramahd.b(ty.J[alq.b(this)]);
/* 131:    */       }
/* 132:    */     }
/* 133:141 */     return paramamj;
/* 134:    */   }
/* 135:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     alb
 * JD-Core Version:    0.7.0.1
 */