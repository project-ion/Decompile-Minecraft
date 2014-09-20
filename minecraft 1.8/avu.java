/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class avu
/*   4:    */   extends atr
/*   5:    */ {
/*   6: 20 */   public static final bew a = bew.a("moisture", 0, 7);
/*   7:    */   
/*   8:    */   protected avu()
/*   9:    */   {
/*  10: 25 */     super(bof.c);
/*  11: 26 */     j(this.L.b().a(a, Integer.valueOf(0)));
/*  12: 27 */     a(true);
/*  13: 28 */     a(0.0F, 0.0F, 0.0F, 1.0F, 0.9375F, 1.0F);
/*  14: 29 */     e(255);
/*  15:    */   }
/*  16:    */   
/*  17:    */   public brt a(aqu paramaqu, dt paramdt, bec parambec)
/*  18:    */   {
/*  19: 35 */     return new brt(paramdt.n(), paramdt.o(), paramdt.p(), paramdt.n() + 1, paramdt.o() + 1, paramdt.p() + 1);
/*  20:    */   }
/*  21:    */   
/*  22:    */   public boolean c()
/*  23:    */   {
/*  24: 40 */     return false;
/*  25:    */   }
/*  26:    */   
/*  27:    */   public boolean d()
/*  28:    */   {
/*  29: 45 */     return false;
/*  30:    */   }
/*  31:    */   
/*  32:    */   public void b(aqu paramaqu, dt paramdt, bec parambec, Random paramRandom)
/*  33:    */   {
/*  34: 50 */     int i = ((Integer)parambec.b(a)).intValue();
/*  35: 52 */     if ((e(paramaqu, paramdt)) || (paramaqu.C(paramdt.a())))
/*  36:    */     {
/*  37: 53 */       if (i < 7) {
/*  38: 54 */         paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(7)), 2);
/*  39:    */       }
/*  40:    */     }
/*  41: 56 */     else if (i > 0) {
/*  42: 57 */       paramaqu.a(paramdt, parambec.a(a, Integer.valueOf(i - 1)), 2);
/*  43: 58 */     } else if (!d(paramaqu, paramdt)) {
/*  44: 59 */       paramaqu.a(paramdt, aty.d.P());
/*  45:    */     }
/*  46:    */   }
/*  47:    */   
/*  48:    */   public void a(aqu paramaqu, dt paramdt, wv paramwv, float paramFloat)
/*  49:    */   {
/*  50: 65 */     if (!(paramwv instanceof xm)) {
/*  51: 66 */       return;
/*  52:    */     }
/*  53: 68 */     if ((!paramaqu.D) && (paramaqu.s.nextFloat() < paramFloat - 0.5F))
/*  54:    */     {
/*  55: 69 */       if ((!(paramwv instanceof ahd)) && (!paramaqu.Q().b("mobGriefing"))) {
/*  56: 70 */         return;
/*  57:    */       }
/*  58: 72 */       paramaqu.a(paramdt, aty.d.P());
/*  59:    */     }
/*  60: 74 */     super.a(paramaqu, paramdt, paramwv, paramFloat);
/*  61:    */   }
/*  62:    */   
/*  63:    */   private boolean d(aqu paramaqu, dt paramdt)
/*  64:    */   {
/*  65: 78 */     atr localatr = paramaqu.p(paramdt.a()).c();
/*  66: 79 */     return ((localatr instanceof auu)) || ((localatr instanceof bay));
/*  67:    */   }
/*  68:    */   
/*  69:    */   private boolean e(aqu paramaqu, dt paramdt)
/*  70:    */   {
/*  71: 83 */     for (dy localdy : dt.b(paramdt.a(-4, 0, -4), paramdt.a(4, 1, 4))) {
/*  72: 84 */       if (paramaqu.p(localdy).c().r() == bof.h) {
/*  73: 85 */         return true;
/*  74:    */       }
/*  75:    */     }
/*  76: 88 */     return false;
/*  77:    */   }
/*  78:    */   
/*  79:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  80:    */   {
/*  81: 93 */     super.a(paramaqu, paramdt, parambec, paramatr);
/*  82: 95 */     if (paramaqu.p(paramdt.a()).c().r().a()) {
/*  83: 96 */       paramaqu.a(paramdt, aty.d.P());
/*  84:    */     }
/*  85:    */   }
/*  86:    */   
/*  87:    */   public alq a(bec parambec, Random paramRandom, int paramInt)
/*  88:    */   {
/*  89:103 */     return aty.d.a(aty.d.P().a(avc.a, avd.a), paramRandom, paramInt);
/*  90:    */   }
/*  91:    */   
/*  92:    */   public alq b(aqu paramaqu, dt paramdt)
/*  93:    */   {
/*  94:108 */     return alq.a(aty.d);
/*  95:    */   }
/*  96:    */   
/*  97:    */   public bec a(int paramInt)
/*  98:    */   {
/*  99:113 */     return P().a(a, Integer.valueOf(paramInt & 0x7));
/* 100:    */   }
/* 101:    */   
/* 102:    */   public int c(bec parambec)
/* 103:    */   {
/* 104:119 */     return ((Integer)parambec.b(a)).intValue();
/* 105:    */   }
/* 106:    */   
/* 107:    */   protected bed e()
/* 108:    */   {
/* 109:124 */     return new bed(this, new bex[] { a });
/* 110:    */   }
/* 111:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     avu
 * JD-Core Version:    0.7.0.1
 */