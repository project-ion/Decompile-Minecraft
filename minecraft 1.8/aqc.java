/*   1:    */ public class aqc
/*   2:    */ {
/*   3:    */   private amj a;
/*   4:    */   private amj b;
/*   5:    */   private amj c;
/*   6:    */   private int d;
/*   7:    */   private int e;
/*   8:    */   private boolean f;
/*   9:    */   
/*  10:    */   public aqc(fn paramfn)
/*  11:    */   {
/*  12: 20 */     a(paramfn);
/*  13:    */   }
/*  14:    */   
/*  15:    */   public aqc(amj paramamj1, amj paramamj2, amj paramamj3)
/*  16:    */   {
/*  17: 24 */     this(paramamj1, paramamj2, paramamj3, 0, 7);
/*  18:    */   }
/*  19:    */   
/*  20:    */   public aqc(amj paramamj1, amj paramamj2, amj paramamj3, int paramInt1, int paramInt2)
/*  21:    */   {
/*  22: 28 */     this.a = paramamj1;
/*  23: 29 */     this.b = paramamj2;
/*  24: 30 */     this.c = paramamj3;
/*  25: 31 */     this.d = paramInt1;
/*  26: 32 */     this.e = paramInt2;
/*  27: 33 */     this.f = true;
/*  28:    */   }
/*  29:    */   
/*  30:    */   public aqc(amj paramamj1, amj paramamj2)
/*  31:    */   {
/*  32: 37 */     this(paramamj1, null, paramamj2);
/*  33:    */   }
/*  34:    */   
/*  35:    */   public aqc(amj paramamj, alq paramalq)
/*  36:    */   {
/*  37: 41 */     this(paramamj, new amj(paramalq));
/*  38:    */   }
/*  39:    */   
/*  40:    */   public amj a()
/*  41:    */   {
/*  42: 49 */     return this.a;
/*  43:    */   }
/*  44:    */   
/*  45:    */   public amj b()
/*  46:    */   {
/*  47: 53 */     return this.b;
/*  48:    */   }
/*  49:    */   
/*  50:    */   public boolean c()
/*  51:    */   {
/*  52: 57 */     return this.b != null;
/*  53:    */   }
/*  54:    */   
/*  55:    */   public amj d()
/*  56:    */   {
/*  57: 61 */     return this.c;
/*  58:    */   }
/*  59:    */   
/*  60:    */   public int e()
/*  61:    */   {
/*  62: 77 */     return this.d;
/*  63:    */   }
/*  64:    */   
/*  65:    */   public int f()
/*  66:    */   {
/*  67: 81 */     return this.e;
/*  68:    */   }
/*  69:    */   
/*  70:    */   public void g()
/*  71:    */   {
/*  72: 85 */     this.d += 1;
/*  73:    */   }
/*  74:    */   
/*  75:    */   public void a(int paramInt)
/*  76:    */   {
/*  77: 89 */     this.e += paramInt;
/*  78:    */   }
/*  79:    */   
/*  80:    */   public boolean h()
/*  81:    */   {
/*  82: 93 */     return this.d >= this.e;
/*  83:    */   }
/*  84:    */   
/*  85:    */   public void i()
/*  86:    */   {
/*  87: 97 */     this.d = this.e;
/*  88:    */   }
/*  89:    */   
/*  90:    */   public boolean j()
/*  91:    */   {
/*  92:101 */     return this.f;
/*  93:    */   }
/*  94:    */   
/*  95:    */   public void a(fn paramfn)
/*  96:    */   {
/*  97:105 */     fn localfn1 = paramfn.m("buy");
/*  98:106 */     this.a = amj.a(localfn1);
/*  99:107 */     fn localfn2 = paramfn.m("sell");
/* 100:108 */     this.c = amj.a(localfn2);
/* 101:109 */     if (paramfn.b("buyB", 10)) {
/* 102:110 */       this.b = amj.a(paramfn.m("buyB"));
/* 103:    */     }
/* 104:112 */     if (paramfn.b("uses", 99)) {
/* 105:113 */       this.d = paramfn.f("uses");
/* 106:    */     }
/* 107:115 */     if (paramfn.b("maxUses", 99)) {
/* 108:116 */       this.e = paramfn.f("maxUses");
/* 109:    */     } else {
/* 110:118 */       this.e = 7;
/* 111:    */     }
/* 112:120 */     if (paramfn.b("rewardExp", 1)) {
/* 113:121 */       this.f = paramfn.n("rewardExp");
/* 114:    */     } else {
/* 115:123 */       this.f = true;
/* 116:    */     }
/* 117:    */   }
/* 118:    */   
/* 119:    */   public fn k()
/* 120:    */   {
/* 121:128 */     fn localfn = new fn();
/* 122:129 */     localfn.a("buy", this.a.b(new fn()));
/* 123:130 */     localfn.a("sell", this.c.b(new fn()));
/* 124:131 */     if (this.b != null) {
/* 125:132 */       localfn.a("buyB", this.b.b(new fn()));
/* 126:    */     }
/* 127:134 */     localfn.a("uses", this.d);
/* 128:135 */     localfn.a("maxUses", this.e);
/* 129:136 */     localfn.a("rewardExp", this.f);
/* 130:137 */     return localfn;
/* 131:    */   }
/* 132:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aqc
 * JD-Core Version:    0.7.0.1
 */