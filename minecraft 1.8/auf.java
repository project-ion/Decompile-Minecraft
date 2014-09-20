/*   1:    */ import java.util.Iterator;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public class auf
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 20 */   public static final bew a = bew.a("age", 0, 15);
/*   8:    */   
/*   9:    */   protected auf()
/*  10:    */   {
/*  11: 23 */     super(bof.A);
/*  12: 24 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  13: 25 */     a(true);
/*  14: 26 */     a(akf.c);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  18:    */   {
/*  19: 31 */     dt localdt = paramdt.a();
/*  20: 32 */     if (!paramaqu.d(localdt)) {
/*  21: 33 */       return;
/*  22:    */     }
/*  23: 36 */     int i = 1;
/*  24: 37 */     while (paramaqu.p(paramdt.c(i)).c() == this) {
/*  25: 38 */       i++;
/*  26:    */     }
/*  27: 41 */     if (i >= 3) {
/*  28: 42 */       return;
/*  29:    */     }
/*  30: 45 */     int j = ((Integer)parambec.b(a)).intValue();
/*  31: 46 */     if (j == 15)
/*  32:    */     {
/*  33: 47 */       paramaqu.a(localdt, P());
/*  34: 48 */       bec localbec = parambec.a(a, Integer.valueOf(0));
/*  35: 49 */       paramaqu.a(paramdt, localbec, 4);
/*  36: 50 */       a(paramaqu, localdt, localbec, this);
/*  37:    */     }
/*  38:    */     else
/*  39:    */     {
/*  40: 52 */       paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(j + 1)), 4);
/*  41:    */     }
/*  42:    */   }
/*  43:    */   
/*  44:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  45:    */   {
/*  46: 59 */     float f = 0.0625F;
/*  47: 60 */     return new brt(paramdt.n() + f, paramdt.o(), paramdt.p() + f, paramdt.n() + 1 - f, paramdt.o() + 1 - f, paramdt.p() + 1 - f);
/*  48:    */   }
/*  49:    */   
/*  50:    */   public brt a(aqu paramaqu, dt paramdt)
/*  51:    */   {
/*  52: 65 */     float f = 0.0625F;
/*  53: 66 */     return new brt(paramdt.n() + f, paramdt.o(), paramdt.p() + f, paramdt.n() + 1 - f, paramdt.o() + 1, paramdt.p() + 1 - f);
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean d()
/*  57:    */   {
/*  58: 71 */     return false;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean c()
/*  62:    */   {
/*  63: 76 */     return false;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean c(aqu paramaqu, dt paramdt)
/*  67:    */   {
/*  68: 81 */     if (super.c(paramaqu, paramdt)) {
/*  69: 82 */       return d(paramaqu, paramdt);
/*  70:    */     }
/*  71: 85 */     return false;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  75:    */   {
/*  76: 90 */     if (!d(paramaqu, paramdt)) {
/*  77: 91 */       paramaqu.b(paramdt, true);
/*  78:    */     }
/*  79:    */   }
/*  80:    */   
/*  81:    */   public boolean d(aqu paramaqu, dt paramdt)
/*  82:    */   {
/*  83: 96 */     for (Object localObject = en.a.iterator(); ((Iterator)localObject).hasNext();)
/*  84:    */     {
/*  85: 96 */       ej localej = (ej)((Iterator)localObject).next();
/*  86: 97 */       if (paramaqu.p(paramdt.a(localej)).c().r().a()) {
/*  87: 98 */         return false;
/*  88:    */       }
/*  89:    */     }
/*  90:101 */     localObject = paramaqu.p(paramdt.b()).c();
/*  91:102 */     return (localObject == aty.aK) || (localObject == aty.m);
/*  92:    */   }
/*  93:    */   
/*  94:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv)
/*  95:    */   {
/*  96:107 */     paramwv.a(wh.h, 1.0F);
/*  97:    */   }
/*  98:    */   
/*  99:    */   public aql k()
/* 100:    */   {
/* 101:112 */     return aql.c;
/* 102:    */   }
/* 103:    */   
/* 104:    */   public bec a(int paramInt)
/* 105:    */   {
/* 106:117 */     return P().a(a, Integer.valueOf(paramInt));
/* 107:    */   }
/* 108:    */   
/* 109:    */   public int c(bec parambec)
/* 110:    */   {
/* 111:123 */     return ((Integer)parambec.b(a)).intValue();
/* 112:    */   }
/* 113:    */   
/* 114:    */   protected bed e()
/* 115:    */   {
/* 116:128 */     return new bed(this, new bex[] { a });
/* 117:    */   }
/* 118:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     auf
 * JD-Core Version:    0.7.0.1
 */