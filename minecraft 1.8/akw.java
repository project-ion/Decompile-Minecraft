/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class akw
/*   5:    */   extends alq
/*   6:    */ {
/*   7: 17 */   public static final int[] a = { 1973019, 11743532, 3887386, 5320730, 2437522, 8073150, 2651799, 11250603, 4408131, 14188952, 4312372, 14602026, 6719955, 12801229, 15435844, 15790320 };
/*   8:    */   
/*   9:    */   public akw()
/*  10:    */   {
/*  11: 22 */     a(true);
/*  12: 23 */     d(0);
/*  13: 24 */     a(akf.l);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public String e_(amj paramamj)
/*  17:    */   {
/*  18: 29 */     int i = paramamj.i();
/*  19: 30 */     return super.a() + "." + akv.a(i).d();
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean a(amj paramamj, ahd paramahd, aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  23:    */   {
/*  24: 35 */     if (!paramahd.a(paramdt.a(paramej), paramej, paramamj)) {
/*  25: 36 */       return false;
/*  26:    */     }
/*  27: 39 */     akv localakv = akv.a(paramamj.i());
/*  28: 40 */     if (localakv == akv.a)
/*  29:    */     {
/*  30: 43 */       if (a(paramamj, paramaqu, paramdt))
/*  31:    */       {
/*  32: 44 */         if (!paramaqu.D) {
/*  33: 45 */           paramaqu.b(2005, paramdt, 0);
/*  34:    */         }
/*  35: 47 */         return true;
/*  36:    */       }
/*  37:    */     }
/*  38: 49 */     else if (localakv == akv.m)
/*  39:    */     {
/*  40: 52 */       bec localbec1 = paramaqu.p(paramdt);
/*  41: 53 */       atr localatr = localbec1.c();
/*  42: 55 */       if ((localatr == aty.r) && (localbec1.b(ayw.a) == ayx.d))
/*  43:    */       {
/*  44: 56 */         if (paramej == ej.a) {
/*  45: 57 */           return false;
/*  46:    */         }
/*  47: 59 */         if (paramej == ej.b) {
/*  48: 60 */           return false;
/*  49:    */         }
/*  50: 62 */         paramdt = paramdt.a(paramej);
/*  51: 64 */         if (paramaqu.d(paramdt))
/*  52:    */         {
/*  53: 65 */           bec localbec2 = aty.bN.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, 0, paramahd);
/*  54: 66 */           paramaqu.a(paramdt, localbec2, 2);
/*  55: 67 */           if (!paramahd.by.d) {
/*  56: 68 */             paramamj.b -= 1;
/*  57:    */           }
/*  58:    */         }
/*  59: 71 */         return true;
/*  60:    */       }
/*  61:    */     }
/*  62: 75 */     return false;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public static boolean a(amj paramamj, aqu paramaqu, dt paramdt)
/*  66:    */   {
/*  67: 79 */     bec localbec = paramaqu.p(paramdt);
/*  68: 81 */     if ((localbec.c() instanceof atz))
/*  69:    */     {
/*  70: 82 */       atz localatz = (atz)localbec.c();
/*  71: 84 */       if (localatz.a(paramaqu, paramdt, localbec, paramaqu.D))
/*  72:    */       {
/*  73: 85 */         if (!paramaqu.D)
/*  74:    */         {
/*  75: 86 */           if (localatz.a(paramaqu, paramaqu.s, paramdt, localbec)) {
/*  76: 87 */             localatz.b(paramaqu, paramaqu.s, paramdt, localbec);
/*  77:    */           }
/*  78: 89 */           paramamj.b -= 1;
/*  79:    */         }
/*  80: 91 */         return true;
/*  81:    */       }
/*  82:    */     }
/*  83: 94 */     return false;
/*  84:    */   }
/*  85:    */   
/*  86:    */   public static void a(aqu paramaqu, dt paramdt, int paramInt)
/*  87:    */   {
/*  88: 98 */     if (paramInt == 0) {
/*  89: 99 */       paramInt = 15;
/*  90:    */     }
/*  91:102 */     atr localatr = paramaqu.p(paramdt).c();
/*  92:103 */     if (localatr.r() == bof.a) {
/*  93:104 */       return;
/*  94:    */     }
/*  95:106 */     localatr.a(paramaqu, paramdt);
/*  96:108 */     for (int i = 0; i < paramInt; i++)
/*  97:    */     {
/*  98:109 */       double d1 = g.nextGaussian() * 0.02D;
/*  99:110 */       double d2 = g.nextGaussian() * 0.02D;
/* 100:111 */       double d3 = g.nextGaussian() * 0.02D;
/* 101:112 */       paramaqu.a(ew.v, paramdt.n() + g.nextFloat(), paramdt.o() + g.nextFloat() * localatr.C(), paramdt.p() + g.nextFloat(), d1, d2, d3, new int[0]);
/* 102:    */     }
/* 103:    */   }
/* 104:    */   
/* 105:    */   public boolean a(amj paramamj, ahd paramahd, xm paramxm)
/* 106:    */   {
/* 107:118 */     if ((paramxm instanceof acl))
/* 108:    */     {
/* 109:119 */       acl localacl = (acl)paramxm;
/* 110:120 */       akv localakv = akv.a(paramamj.i());
/* 111:121 */       if ((!localacl.ck()) && (localacl.cj() != localakv))
/* 112:    */       {
/* 113:122 */         localacl.b(localakv);
/* 114:123 */         paramamj.b -= 1;
/* 115:    */       }
/* 116:126 */       return true;
/* 117:    */     }
/* 118:128 */     return false;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void a(alq paramalq, akf paramakf, List paramList)
/* 122:    */   {
/* 123:133 */     for (int i = 0; i < 16; i++) {
/* 124:134 */       paramList.add(new amj(paramalq, 1, i));
/* 125:    */     }
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     akw
 * JD-Core Version:    0.7.0.1
 */