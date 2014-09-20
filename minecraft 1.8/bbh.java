/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class bbh
/*   5:    */   extends auc
/*   6:    */   implements atz
/*   7:    */ {
/*   8: 25 */   public static final bev a = bev.a("type", bbi.class);
/*   9:    */   
/*  10:    */   protected bbh()
/*  11:    */   {
/*  12: 28 */     super(bof.l);
/*  13: 29 */     j(this.L.b().a(a, bbi.a));
/*  14: 30 */     float f = 0.4F;
/*  15: 31 */     a(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, 0.8F, 0.5F + f);
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int F()
/*  19:    */   {
/*  20: 36 */     return aqt.a(0.5D, 1.0D);
/*  21:    */   }
/*  22:    */   
/*  23:    */   public boolean f(aqu paramaqu, dt paramdt, bec parambec)
/*  24:    */   {
/*  25: 41 */     return c(paramaqu.p(paramdt.b()).c());
/*  26:    */   }
/*  27:    */   
/*  28:    */   public boolean f(aqu paramaqu, dt paramdt)
/*  29:    */   {
/*  30: 46 */     return true;
/*  31:    */   }
/*  32:    */   
/*  33:    */   public int h(bec parambec)
/*  34:    */   {
/*  35: 51 */     if (parambec.c() != this) {
/*  36: 52 */       return super.h(parambec);
/*  37:    */     }
/*  38: 55 */     bbi localbbi = (bbi)parambec.b(a);
/*  39: 56 */     if (localbbi == bbi.a) {
/*  40: 57 */       return 16777215;
/*  41:    */     }
/*  42: 60 */     return aqt.a(0.5D, 1.0D);
/*  43:    */   }
/*  44:    */   
/*  45:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  46:    */   {
/*  47: 65 */     return paramard.b(paramdt).b(paramdt);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  51:    */   {
/*  52: 71 */     if (paramRandom.nextInt(8) == 0) {
/*  53: 72 */       return amk.N;
/*  54:    */     }
/*  55: 75 */     return null;
/*  56:    */   }
/*  57:    */   
/*  58:    */   public int a(int paramInt, Random paramRandom)
/*  59:    */   {
/*  60: 80 */     return 1 + paramRandom.nextInt(paramInt * 2 + 1);
/*  61:    */   }
/*  62:    */   
/*  63:    */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/*  64:    */   {
/*  65: 85 */     if ((!paramaqu.D) && (paramahd.bY() != null) && (paramahd.bY().b() == amk.be))
/*  66:    */     {
/*  67: 86 */       paramahd.b(ty.H[atr.a(this)]);
/*  68:    */       
/*  69:    */ 
/*  70: 89 */       a(paramaqu, paramdt, new amj(aty.H, 1, ((bbi)parambec.b(a)).a()));
/*  71:    */     }
/*  72:    */     else
/*  73:    */     {
/*  74: 91 */       super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/*  75:    */     }
/*  76:    */   }
/*  77:    */   
/*  78:    */   public int j(aqu paramaqu, dt paramdt)
/*  79:    */   {
/*  80: 97 */     bec localbec = paramaqu.p(paramdt);
/*  81: 98 */     return localbec.c().c(localbec);
/*  82:    */   }
/*  83:    */   
/*  84:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  85:    */   {
/*  86:103 */     for (int i = 1; i < 3; i++) {
/*  87:104 */       paramList.add(new amj(paramalq, 1, i));
/*  88:    */     }
/*  89:    */   }
/*  90:    */   
/*  91:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, boolean paramBoolean)
/*  92:    */   {
/*  93:110 */     return parambec.b(a) != bbi.a;
/*  94:    */   }
/*  95:    */   
/*  96:    */   public boolean a(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/*  97:    */   {
/*  98:115 */     return true;
/*  99:    */   }
/* 100:    */   
/* 101:    */   public void b(aqu paramaqu, Random paramRandom, dt paramdt, bec parambec)
/* 102:    */   {
/* 103:120 */     avk localavk = avk.c;
/* 104:121 */     if (parambec.b(a) == bbi.c) {
/* 105:122 */       localavk = avk.d;
/* 106:    */     }
/* 107:124 */     if (aty.cF.c(paramaqu, paramdt)) {
/* 108:125 */       aty.cF.a(paramaqu, paramdt, localavk, 2);
/* 109:    */     }
/* 110:    */   }
/* 111:    */   
/* 112:    */   public bec a(int paramInt)
/* 113:    */   {
/* 114:131 */     return P().a(a, bbi.a(paramInt));
/* 115:    */   }
/* 116:    */   
/* 117:    */   public int c(bec parambec)
/* 118:    */   {
/* 119:137 */     return ((bbi)parambec.b(a)).a();
/* 120:    */   }
/* 121:    */   
/* 122:    */   protected bed e()
/* 123:    */   {
/* 124:142 */     return new bed(this, new bex[] { a });
/* 125:    */   }
/* 126:    */   
/* 127:    */   public atw Q()
/* 128:    */   {
/* 129:192 */     return atw.c;
/* 130:    */   }
/* 131:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbh
 * JD-Core Version:    0.7.0.1
 */