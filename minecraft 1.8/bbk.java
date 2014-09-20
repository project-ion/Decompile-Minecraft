/*   1:    */ import java.util.Random;
/*   2:    */ 
/*   3:    */ public class bbk
/*   4:    */   extends atr
/*   5:    */ {
/*   6: 21 */   public static final bet a = bet.a("explode");
/*   7:    */   
/*   8:    */   public bbk()
/*   9:    */   {
/*  10: 24 */     super(bof.u);
/*  11: 25 */     j(this.L.b().a(a, Boolean.valueOf(false)));
/*  12: 26 */     a(akf.d);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public void c(aqu paramaqu, dt paramdt, bec parambec)
/*  16:    */   {
/*  17: 31 */     super.c(paramaqu, paramdt, parambec);
/*  18: 33 */     if (paramaqu.z(paramdt))
/*  19:    */     {
/*  20: 34 */       d(paramaqu, paramdt, parambec.a(a, Boolean.valueOf(true)));
/*  21: 35 */       paramaqu.g(paramdt);
/*  22:    */     }
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, atr paramatr)
/*  26:    */   {
/*  27: 41 */     if (paramaqu.z(paramdt))
/*  28:    */     {
/*  29: 42 */       d(paramaqu, paramdt, parambec.a(a, Boolean.valueOf(true)));
/*  30: 43 */       paramaqu.g(paramdt);
/*  31:    */     }
/*  32:    */   }
/*  33:    */   
/*  34:    */   public void a(aqu paramaqu, dt paramdt, aqo paramaqo)
/*  35:    */   {
/*  36: 49 */     if (paramaqu.D) {
/*  37: 50 */       return;
/*  38:    */     }
/*  39: 53 */     aek localaek = new aek(paramaqu, paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, paramaqo.c());
/*  40: 54 */     localaek.a = (paramaqu.s.nextInt(localaek.a / 4) + localaek.a / 8);
/*  41: 55 */     paramaqu.d(localaek);
/*  42:    */   }
/*  43:    */   
/*  44:    */   public void d(aqu paramaqu, dt paramdt, bec parambec)
/*  45:    */   {
/*  46: 60 */     a(paramaqu, paramdt, parambec, null);
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, xm paramxm)
/*  50:    */   {
/*  51: 64 */     if (paramaqu.D) {
/*  52: 65 */       return;
/*  53:    */     }
/*  54: 68 */     if (((Boolean)parambec.b(a)).booleanValue())
/*  55:    */     {
/*  56: 69 */       aek localaek = new aek(paramaqu, paramdt.n() + 0.5F, paramdt.o() + 0.5F, paramdt.p() + 0.5F, paramxm);
/*  57: 70 */       paramaqu.d(localaek);
/*  58: 71 */       paramaqu.a(localaek, "game.tnt.primed", 1.0F, 1.0F);
/*  59:    */     }
/*  60:    */   }
/*  61:    */   
/*  62:    */   public boolean a(aqu paramaqu, dt paramdt, bec parambec, ahd paramahd, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3)
/*  63:    */   {
/*  64: 77 */     if (paramahd.bY() != null)
/*  65:    */     {
/*  66: 78 */       alq localalq = paramahd.bY().b();
/*  67: 79 */       if ((localalq == amk.d) || (localalq == amk.bL))
/*  68:    */       {
/*  69: 80 */         a(paramaqu, paramdt, parambec.a(a, Boolean.valueOf(true)), paramahd);
/*  70: 81 */         paramaqu.g(paramdt);
/*  71: 83 */         if (localalq == amk.d) {
/*  72: 84 */           paramahd.bY().a(1, paramahd);
/*  73: 85 */         } else if (!paramahd.by.d) {
/*  74: 86 */           paramahd.bY().b -= 1;
/*  75:    */         }
/*  76: 88 */         return true;
/*  77:    */       }
/*  78:    */     }
/*  79: 91 */     return super.a(paramaqu, paramdt, parambec, paramahd, paramej, paramFloat1, paramFloat2, paramFloat3);
/*  80:    */   }
/*  81:    */   
/*  82:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, wv paramwv)
/*  83:    */   {
/*  84: 96 */     if ((!paramaqu.D) && ((paramwv instanceof ahj)))
/*  85:    */     {
/*  86: 97 */       ahj localahj = (ahj)paramwv;
/*  87: 98 */       if (localahj.au())
/*  88:    */       {
/*  89: 99 */         a(paramaqu, paramdt, paramaqu.p(paramdt).a(a, Boolean.valueOf(true)), (localahj.c instanceof xm) ? (xm)localahj.c : null);
/*  90:100 */         paramaqu.g(paramdt);
/*  91:    */       }
/*  92:    */     }
/*  93:    */   }
/*  94:    */   
/*  95:    */   public boolean a(aqo paramaqo)
/*  96:    */   {
/*  97:107 */     return false;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public bec a(int paramInt)
/* 101:    */   {
/* 102:112 */     return P().a(a, Boolean.valueOf((paramInt & 0x1) > 0));
/* 103:    */   }
/* 104:    */   
/* 105:    */   public int c(bec parambec)
/* 106:    */   {
/* 107:117 */     return ((Boolean)parambec.b(a)).booleanValue() ? 1 : 0;
/* 108:    */   }
/* 109:    */   
/* 110:    */   protected bed e()
/* 111:    */   {
/* 112:122 */     return new bed(this, new bex[] { a });
/* 113:    */   }
/* 114:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bbk
 * JD-Core Version:    0.7.0.1
 */