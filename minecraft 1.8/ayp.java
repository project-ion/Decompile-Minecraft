/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class ayp
/*   5:    */   extends axg
/*   6:    */ {
/*   7: 22 */   public static final bev P = bev.a("variant", ayx.class, new ayq());
/*   8:    */   
/*   9:    */   public ayp()
/*  10:    */   {
/*  11: 30 */     j(this.L.b().a(P, ayx.a).a(b, Boolean.valueOf(true)).a(a, Boolean.valueOf(true)));
/*  12:    */   }
/*  13:    */   
/*  14:    */   public int h(bec parambec)
/*  15:    */   {
/*  16: 35 */     if (parambec.c() != this) {
/*  17: 36 */       return super.h(parambec);
/*  18:    */     }
/*  19: 39 */     ayx localayx = (ayx)parambec.b(P);
/*  20: 40 */     if (localayx == ayx.b) {
/*  21: 41 */       return aqp.a();
/*  22:    */     }
/*  23: 43 */     if (localayx == ayx.c) {
/*  24: 44 */       return aqp.b();
/*  25:    */     }
/*  26: 47 */     return super.h(parambec);
/*  27:    */   }
/*  28:    */   
/*  29:    */   public int a(ard paramard, dt paramdt, int paramInt)
/*  30:    */   {
/*  31: 52 */     bec localbec = paramard.p(paramdt);
/*  32: 53 */     if (localbec.c() == this)
/*  33:    */     {
/*  34: 54 */       ayx localayx = (ayx)localbec.b(P);
/*  35: 56 */       if (localayx == ayx.b) {
/*  36: 57 */         return aqp.a();
/*  37:    */       }
/*  38: 59 */       if (localayx == ayx.c) {
/*  39: 60 */         return aqp.b();
/*  40:    */       }
/*  41:    */     }
/*  42: 64 */     return super.a(paramard, paramdt, paramInt);
/*  43:    */   }
/*  44:    */   
/*  45:    */   protected void a(aqu paramaqu, dt paramdt, bec parambec, int paramInt)
/*  46:    */   {
/*  47: 69 */     if ((parambec.b(P) == ayx.a) && (paramaqu.s.nextInt(paramInt) == 0)) {
/*  48: 70 */       a(paramaqu, paramdt, new amj(amk.e, 1, 0));
/*  49:    */     }
/*  50:    */   }
/*  51:    */   
/*  52:    */   protected int d(bec parambec)
/*  53:    */   {
/*  54: 76 */     if (parambec.b(P) == ayx.d) {
/*  55: 77 */       return 40;
/*  56:    */     }
/*  57: 80 */     return super.d(parambec);
/*  58:    */   }
/*  59:    */   
/*  60:    */   public void a(alq paramalq, akf paramakf, List paramList)
/*  61:    */   {
/*  62: 85 */     paramList.add(new amj(paramalq, 1, ayx.a.a()));
/*  63: 86 */     paramList.add(new amj(paramalq, 1, ayx.b.a()));
/*  64: 87 */     paramList.add(new amj(paramalq, 1, ayx.c.a()));
/*  65: 88 */     paramList.add(new amj(paramalq, 1, ayx.d.a()));
/*  66:    */   }
/*  67:    */   
/*  68:    */   protected amj i(bec parambec)
/*  69:    */   {
/*  70: 93 */     return new amj(alq.a(this), 1, ((ayx)parambec.b(P)).a());
/*  71:    */   }
/*  72:    */   
/*  73:    */   public bec a(int paramInt)
/*  74:    */   {
/*  75: 98 */     return P().a(P, b(paramInt)).a(a, Boolean.valueOf((paramInt & 0x4) == 0)).a(b, Boolean.valueOf((paramInt & 0x8) > 0));
/*  76:    */   }
/*  77:    */   
/*  78:    */   public int c(bec parambec)
/*  79:    */   {
/*  80:106 */     int i = 0;
/*  81:    */     
/*  82:108 */     i |= ((ayx)parambec.b(P)).a();
/*  83:110 */     if (!((Boolean)parambec.b(a)).booleanValue()) {
/*  84:111 */       i |= 0x4;
/*  85:    */     }
/*  86:114 */     if (((Boolean)parambec.b(b)).booleanValue()) {
/*  87:115 */       i |= 0x8;
/*  88:    */     }
/*  89:118 */     return i;
/*  90:    */   }
/*  91:    */   
/*  92:    */   public ayx b(int paramInt)
/*  93:    */   {
/*  94:123 */     return ayx.a((paramInt & 0x3) % 4);
/*  95:    */   }
/*  96:    */   
/*  97:    */   protected bed e()
/*  98:    */   {
/*  99:128 */     return new bed(this, new bex[] { P, b, a });
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int a(bec parambec)
/* 103:    */   {
/* 104:133 */     return ((ayx)parambec.b(P)).a();
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void a(aqu paramaqu, ahd paramahd, dt paramdt, bec parambec, bcm parambcm)
/* 108:    */   {
/* 109:138 */     if ((!paramaqu.D) && (paramahd.bY() != null) && (paramahd.bY().b() == amk.be))
/* 110:    */     {
/* 111:139 */       paramahd.b(ty.H[atr.a(this)]);
/* 112:    */       
/* 113:    */ 
/* 114:142 */       a(paramaqu, paramdt, new amj(alq.a(this), 1, ((ayx)parambec.b(P)).a()));
/* 115:143 */       return;
/* 116:    */     }
/* 117:146 */     super.a(paramaqu, paramahd, paramdt, parambec, parambcm);
/* 118:    */   }
/* 119:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ayp
 * JD-Core Version:    0.7.0.1
 */