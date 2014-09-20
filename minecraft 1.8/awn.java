/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class awn
/*   4:    */   extends atr
/*   5:    */   implements atz
/*   6:    */ {
/*   7: 20 */   public static final bet a = bet.a("snowy");
/*   8:    */   
/*   9:    */   protected awn()
/*  10:    */   {
/*  11: 25 */     super(bof.b);
/*  12: 26 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/*  13: 27 */     a(true);
/*  14: 28 */     a(akf.b);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public bec a(bec parambec, ard paramard, dt paramdt)
/*  18:    */   {
/*  19: 33 */     atr localatr = paramard.p(paramdt.a()).c();
/*  20: 34 */     return parambec.a(a, Boolean.valueOf((localatr == aty.aJ) || (localatr == aty.aH)));
/*  21:    */   }
/*  22:    */   
/*  23:    */   public int F()
/*  24:    */   {
/*  25: 39 */     return aqt.a(0.5D, 1.0D);
/*  26:    */   }
/*  27:    */   
/*  28:    */   public int h(bec parambec)
/*  29:    */   {
/*  30: 44 */     return F();
/*  31:    */   }
/*  32:    */   
/*  33:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  34:    */   {
/*  35: 49 */     return art.a(paramard, paramdt);
/*  36:    */   }
/*  37:    */   
/*  38:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  39:    */   {
/*  40: 54 */     if (paramaqu.D) {
/*  41: 55 */       return;
/*  42:    */     }
/*  43: 58 */     if ((paramaqu.l(paramdt.a()) < 4) && (paramaqu.p(paramdt.a()).c().n() > 2))
/*  44:    */     {
/*  45: 59 */       paramaqu.a(paramdt, aty.d.P());
/*  46: 60 */       return;
/*  47:    */     }
/*  48: 63 */     if (paramaqu.l(paramdt.a()) >= 9) {
/*  49: 64 */       for (int i = 0; i < 4; i++)
/*  50:    */       {
/*  51: 65 */         dt localdt = paramdt.a(paramRandom.nextInt(3) - 1, paramRandom.nextInt(5) - 3, paramRandom.nextInt(3) - 1);
/*  52: 66 */         atr localatr = paramaqu.p(localdt.a()).c();
/*  53: 67 */         bec localbec = paramaqu.p(localdt);
/*  54: 68 */         if ((localbec.c() == aty.d) && (localbec.b(avc.a) == avd.a) && (paramaqu.l(localdt.a()) >= 4) && (localatr.n() <= 2)) {
/*  55: 69 */           paramaqu.a(localdt, aty.c.P());
/*  56:    */         }
/*  57:    */       }
/*  58:    */     }
/*  59:    */   }
/*  60:    */   
/*  61:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  62:    */   {
/*  63: 78 */     return aty.d.a(aty.d.P().a(avc.a, avd.a), paramRandom, paramInt);
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, boolean paramBoolean)
/*  67:    */   {
/*  68: 83 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   public boolean a(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/*  72:    */   {
/*  73: 88 */     return true;
/*  74:    */   }
/*  75:    */   
/*  76:    */   public void b(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/*  77:    */   {
/*  78: 93 */     dt localdt1 = paramdt.a();
/*  79:    */     label260:
/*  80: 95 */     for (int i = 0; i < 128; i++)
/*  81:    */     {
/*  82: 96 */       dt localdt2 = localdt1;
/*  83: 97 */       for (int j = 0; j < i / 16; j++)
/*  84:    */       {
/*  85: 98 */         localdt2 = localdt2.a(paramRandom.nextInt(3) - 1, (paramRandom.nextInt(3) - 1) * paramRandom.nextInt(3) / 2, paramRandom.nextInt(3) - 1);
/*  86: 99 */         if ((paramaqu.p(localdt2.b()).c() != aty.c) || (paramaqu.p(localdt2).c().t())) {
/*  87:    */           break label260;
/*  88:    */         }
/*  89:    */       }
/*  90:104 */       if (paramaqu.p(localdt2).c().J == bof.a)
/*  91:    */       {
/*  92:    */         Object localObject;
/*  93:108 */         if (paramRandom.nextInt(8) == 0)
/*  94:    */         {
/*  95:109 */           localObject = paramaqu.b(localdt2).a(paramRandom, localdt2);
/*  96:110 */           avy localavy = ((awa)localObject).a().a();
/*  97:111 */           bec localbec = localavy.P().a(localavy.l(), (Comparable)localObject);
/*  98:112 */           if (localavy.f(paramaqu, localdt2, localbec)) {
/*  99:113 */             paramaqu.a(localdt2, localbec, 3);
/* 100:    */           }
/* 101:    */         }
/* 102:    */         else
/* 103:    */         {
/* 104:116 */           localObject = aty.H.P().a(bbh.a, bbi.b);
/* 105:117 */           if (aty.H.f(paramaqu, localdt2, (bec)localObject)) {
/* 106:118 */             paramaqu.a(localdt2, (bec)localObject, 3);
/* 107:    */           }
/* 108:    */         }
/* 109:    */       }
/* 110:    */     }
/* 111:    */   }
/* 112:    */   
/* 113:    */   public aql k()
/* 114:    */   {
/* 115:126 */     return aql.b;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int c(bec parambec)
/* 119:    */   {
/* 120:131 */     return 0;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected bed e()
/* 124:    */   {
/* 125:136 */     return new bed(this, new bex[] { a });
/* 126:    */   }
/* 127:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     awn
 * JD-Core Version:    0.7.0.1
 */