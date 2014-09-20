/*   1:    */ import java.util.List;
/*   2:    */ import java.util.Random;
/*   3:    */ 
/*   4:    */ public abstract class awq
/*   5:    */   extends atr
/*   6:    */ {
/*   7: 21 */   public static final bev a = bev.a("half", awr.class);
/*   8:    */   
/*   9:    */   public awq(bof parambof)
/*  10:    */   {
/*  11: 27 */     super(parambof);
/*  12: 29 */     if (j()) {
/*  13: 30 */       this.r = true;
/*  14:    */     } else {
/*  15: 32 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  16:    */     }
/*  17: 34 */     e(255);
/*  18:    */   }
/*  19:    */   
/*  20:    */   protected boolean G()
/*  21:    */   {
/*  22: 39 */     return false;
/*  23:    */   }
/*  24:    */   
/*  25:    */   public void a(ard paramard, dt paramdt)
/*  26:    */   {
/*  27: 44 */     if (j())
/*  28:    */     {
/*  29: 45 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  30: 46 */       return;
/*  31:    */     }
/*  32: 49 */     bec localbec = paramard.p(paramdt);
/*  33: 50 */     if (localbec.c() == this) {
/*  34: 51 */       if (localbec.b(a) == awr.a) {
/*  35: 52 */         a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  36:    */       } else {
/*  37: 54 */         a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  38:    */       }
/*  39:    */     }
/*  40:    */   }
/*  41:    */   
/*  42:    */   public void h()
/*  43:    */   {
/*  44: 61 */     if (j()) {
/*  45: 62 */       a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
/*  46:    */     } else {
/*  47: 64 */       a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
/*  48:    */     }
/*  49:    */   }
/*  50:    */   
/*  51:    */   public void a(aqu paramaqu, dt paramdt, bec parambec, brt parambrt, List paramList, wv paramwv)
/*  52:    */   {
/*  53: 70 */     a(paramaqu, paramdt);
/*  54: 71 */     super.a(paramaqu, paramdt, parambec, parambrt, paramList, paramwv);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean c()
/*  58:    */   {
/*  59: 76 */     return j();
/*  60:    */   }
/*  61:    */   
/*  62:    */   public bec a(aqu paramaqu, dt paramdt, ej paramej, float paramFloat1, float paramFloat2, float paramFloat3, int paramInt, xm paramxm)
/*  63:    */   {
/*  64: 81 */     bec localbec = super.a(paramaqu, paramdt, paramej, paramFloat1, paramFloat2, paramFloat3, paramInt, paramxm).a(a, awr.b);
/*  65: 83 */     if (j()) {
/*  66: 84 */       return localbec;
/*  67:    */     }
/*  68: 87 */     if ((paramej == ej.a) || ((paramej != ej.b) && (paramFloat2 > 0.5D))) {
/*  69: 88 */       return localbec.a(a, awr.a);
/*  70:    */     }
/*  71: 90 */     return localbec;
/*  72:    */   }
/*  73:    */   
/*  74:    */   public int a(Random paramRandom)
/*  75:    */   {
/*  76: 95 */     if (j()) {
/*  77: 96 */       return 2;
/*  78:    */     }
/*  79: 98 */     return 1;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public boolean d()
/*  83:    */   {
/*  84:103 */     return j();
/*  85:    */   }
/*  86:    */   
/*  87:    */   public boolean a(ard paramard, dt paramdt, ej paramej)
/*  88:    */   {
/*  89:108 */     if (j()) {
/*  90:109 */       return super.a(paramard, paramdt, paramej);
/*  91:    */     }
/*  92:112 */     if ((paramej != ej.b) && (paramej != ej.a) && (!super.a(paramard, paramdt, paramej))) {
/*  93:113 */       return false;
/*  94:    */     }
/*  95:116 */     dt localdt = paramdt.a(paramej.d());
/*  96:    */     
/*  97:118 */     bec localbec1 = paramard.p(paramdt);
/*  98:119 */     bec localbec2 = paramard.p(localdt);
/*  99:    */     
/* 100:121 */     int i = (c(localbec1.c())) && (localbec1.b(a) == awr.a) ? 1 : 0;
/* 101:122 */     int j = (c(localbec2.c())) && (localbec2.b(a) == awr.a) ? 1 : 0;
/* 102:123 */     if (j != 0)
/* 103:    */     {
/* 104:124 */       if (paramej == ej.a) {
/* 105:125 */         return true;
/* 106:    */       }
/* 107:127 */       if ((paramej == ej.b) && (super.a(paramard, paramdt, paramej))) {
/* 108:128 */         return true;
/* 109:    */       }
/* 110:130 */       return (!c(localbec1.c())) || (i == 0);
/* 111:    */     }
/* 112:132 */     if (paramej == ej.b) {
/* 113:133 */       return true;
/* 114:    */     }
/* 115:135 */     if ((paramej == ej.a) && (super.a(paramard, paramdt, paramej))) {
/* 116:136 */       return true;
/* 117:    */     }
/* 118:138 */     return (!c(localbec1.c())) || (i != 0);
/* 119:    */   }
/* 120:    */   
/* 121:    */   protected static boolean c(atr paramatr)
/* 122:    */   {
/* 123:143 */     return (paramatr == aty.U) || (paramatr == aty.bM) || (paramatr == aty.cP);
/* 124:    */   }
/* 125:    */   
/* 126:    */   public abstract String b(int paramInt);
/* 127:    */   
/* 128:    */   public int j(aqu paramaqu, dt paramdt)
/* 129:    */   {
/* 130:150 */     return super.j(paramaqu, paramdt) & 0x7;
/* 131:    */   }
/* 132:    */   
/* 133:    */   public abstract boolean j();
/* 134:    */   
/* 135:    */   public abstract bex l();
/* 136:    */   
/* 137:    */   public abstract Object a(amj paramamj);
/* 138:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     awq
 * JD-Core Version:    0.7.0.1
 */