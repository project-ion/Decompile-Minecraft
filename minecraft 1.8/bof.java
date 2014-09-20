/*   1:    */ public class bof
/*   2:    */ {
/*   3:  4 */   public static final bof a = new bod(boh.b);
/*   4:  5 */   public static final bof b = new bof(boh.c);
/*   5:  6 */   public static final bof c = new bof(boh.l);
/*   6:  7 */   public static final bof d = new bof(boh.o).g();
/*   7:  8 */   public static final bof e = new bof(boh.m).f();
/*   8:  9 */   public static final bof f = new bof(boh.h).f();
/*   9: 10 */   public static final bof g = new bof(boh.h).f().o();
/*  10: 11 */   public static final bof h = new boe(boh.n).n();
/*  11: 12 */   public static final bof i = new boe(boh.f).n();
/*  12: 13 */   public static final bof j = new bof(boh.i).g().s().n();
/*  13: 14 */   public static final bof k = new boc(boh.i).n();
/*  14: 15 */   public static final bof l = new boc(boh.i).g().n().i();
/*  15: 16 */   public static final bof m = new bof(boh.e);
/*  16: 17 */   public static final bof n = new bof(boh.e).g();
/*  17: 18 */   public static final bof o = new bod(boh.b).n();
/*  18: 19 */   public static final bof p = new bof(boh.d);
/*  19: 20 */   public static final bof q = new boc(boh.b).n();
/*  20: 21 */   public static final bof r = new boc(boh.e).g();
/*  21: 22 */   public static final bof s = new bof(boh.b).s().p();
/*  22: 23 */   public static final bof t = new bof(boh.b).p();
/*  23: 24 */   public static final bof u = new bof(boh.f).g().s();
/*  24: 25 */   public static final bof v = new bof(boh.i).n();
/*  25: 26 */   public static final bof w = new bof(boh.g).s().p();
/*  26: 27 */   public static final bof x = new bof(boh.g).p();
/*  27: 28 */   public static final bof y = new boc(boh.j).i().s().f().n();
/*  28: 29 */   public static final bof z = new bof(boh.j).f();
/*  29: 30 */   public static final bof A = new bof(boh.i).s().n();
/*  30: 31 */   public static final bof B = new bof(boh.k);
/*  31: 32 */   public static final bof C = new bof(boh.i).n();
/*  32: 33 */   public static final bof D = new bof(boh.i).n();
/*  33: 34 */   public static final bof E = new boi(boh.b).o();
/*  34: 35 */   public static final bof F = new bof(boh.b).n();
/*  35: 36 */   public static final bof G = new bog(boh.e).f().n();
/*  36: 42 */   public static final bof H = new bof(boh.m).o();
/*  37: 43 */   public static final bof I = new bof(boh.b).f().o();
/*  38:    */   private boolean J;
/*  39:    */   private boolean K;
/*  40:    */   private boolean L;
/*  41:    */   private final boh M;
/*  42: 52 */   private boolean N = true;
/*  43:    */   private int O;
/*  44:    */   private boolean P;
/*  45:    */   
/*  46:    */   public bof(boh paramboh)
/*  47:    */   {
/*  48: 57 */     this.M = paramboh;
/*  49:    */   }
/*  50:    */   
/*  51:    */   public boolean d()
/*  52:    */   {
/*  53: 61 */     return false;
/*  54:    */   }
/*  55:    */   
/*  56:    */   public boolean a()
/*  57:    */   {
/*  58: 69 */     return true;
/*  59:    */   }
/*  60:    */   
/*  61:    */   public boolean b()
/*  62:    */   {
/*  63: 73 */     return true;
/*  64:    */   }
/*  65:    */   
/*  66:    */   public boolean c()
/*  67:    */   {
/*  68: 77 */     return true;
/*  69:    */   }
/*  70:    */   
/*  71:    */   private bof s()
/*  72:    */   {
/*  73: 81 */     this.L = true;
/*  74: 82 */     return this;
/*  75:    */   }
/*  76:    */   
/*  77:    */   protected bof f()
/*  78:    */   {
/*  79: 86 */     this.N = false;
/*  80: 87 */     return this;
/*  81:    */   }
/*  82:    */   
/*  83:    */   protected bof g()
/*  84:    */   {
/*  85: 91 */     this.J = true;
/*  86: 92 */     return this;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public boolean h()
/*  90:    */   {
/*  91: 96 */     return this.J;
/*  92:    */   }
/*  93:    */   
/*  94:    */   public bof i()
/*  95:    */   {
/*  96:100 */     this.K = true;
/*  97:101 */     return this;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public boolean j()
/* 101:    */   {
/* 102:105 */     return this.K;
/* 103:    */   }
/* 104:    */   
/* 105:    */   public boolean k()
/* 106:    */   {
/* 107:109 */     if (this.L) {
/* 108:110 */       return false;
/* 109:    */     }
/* 110:112 */     return c();
/* 111:    */   }
/* 112:    */   
/* 113:    */   public boolean l()
/* 114:    */   {
/* 115:118 */     return this.N;
/* 116:    */   }
/* 117:    */   
/* 118:    */   public int m()
/* 119:    */   {
/* 120:122 */     return this.O;
/* 121:    */   }
/* 122:    */   
/* 123:    */   protected bof n()
/* 124:    */   {
/* 125:126 */     this.O = 1;
/* 126:127 */     return this;
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected bof o()
/* 130:    */   {
/* 131:131 */     this.O = 2;
/* 132:132 */     return this;
/* 133:    */   }
/* 134:    */   
/* 135:    */   protected bof p()
/* 136:    */   {
/* 137:136 */     this.P = true;
/* 138:137 */     return this;
/* 139:    */   }
/* 140:    */   
/* 141:    */   public boh r()
/* 142:    */   {
/* 143:145 */     return this.M;
/* 144:    */   }
/* 145:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     bof
 * JD-Core Version:    0.7.0.1
 */