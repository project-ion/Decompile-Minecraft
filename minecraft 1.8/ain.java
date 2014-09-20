/*   1:    */ public class ain
/*   2:    */   implements vq
/*   3:    */ {
/*   4:    */   private final amj[] a;
/*   5:    */   private final int b;
/*   6:    */   private final int c;
/*   7:    */   private final aib d;
/*   8:    */   
/*   9:    */   public ain(aib paramaib, int paramInt1, int paramInt2)
/*  10:    */   {
/*  11: 21 */     int i = paramInt1 * paramInt2;
/*  12: 22 */     this.a = new amj[i];
/*  13: 23 */     this.d = paramaib;
/*  14: 24 */     this.b = paramInt1;
/*  15: 25 */     this.c = paramInt2;
/*  16:    */   }
/*  17:    */   
/*  18:    */   public int n_()
/*  19:    */   {
/*  20: 30 */     return this.a.length;
/*  21:    */   }
/*  22:    */   
/*  23:    */   public amj a(int paramInt)
/*  24:    */   {
/*  25: 36 */     if (paramInt >= n_()) {
/*  26: 37 */       return null;
/*  27:    */     }
/*  28: 39 */     return this.a[paramInt];
/*  29:    */   }
/*  30:    */   
/*  31:    */   public amj c(int paramInt1, int paramInt2)
/*  32:    */   {
/*  33: 44 */     if ((paramInt1 < 0) || (paramInt1 >= this.b) || (paramInt2 < 0) || (paramInt2 > this.c)) {
/*  34: 45 */       return null;
/*  35:    */     }
/*  36: 47 */     return a(paramInt1 + paramInt2 * this.b);
/*  37:    */   }
/*  38:    */   
/*  39:    */   public String d_()
/*  40:    */   {
/*  41: 52 */     return "container.crafting";
/*  42:    */   }
/*  43:    */   
/*  44:    */   public boolean k_()
/*  45:    */   {
/*  46: 57 */     return false;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public ho e_()
/*  50:    */   {
/*  51: 62 */     if (k_()) {
/*  52: 63 */       return new hy(d_());
/*  53:    */     }
/*  54: 65 */     return new hz(d_(), new Object[0]);
/*  55:    */   }
/*  56:    */   
/*  57:    */   public amj b(int paramInt)
/*  58:    */   {
/*  59: 71 */     if (this.a[paramInt] != null)
/*  60:    */     {
/*  61: 72 */       amj localamj = this.a[paramInt];
/*  62: 73 */       this.a[paramInt] = null;
/*  63: 74 */       return localamj;
/*  64:    */     }
/*  65: 76 */     return null;
/*  66:    */   }
/*  67:    */   
/*  68:    */   public amj a(int paramInt1, int paramInt2)
/*  69:    */   {
/*  70: 82 */     if (this.a[paramInt1] != null)
/*  71:    */     {
/*  72: 83 */       if (this.a[paramInt1].b <= paramInt2)
/*  73:    */       {
/*  74: 84 */         localamj = this.a[paramInt1];
/*  75: 85 */         this.a[paramInt1] = null;
/*  76: 86 */         this.d.a(this);
/*  77: 87 */         return localamj;
/*  78:    */       }
/*  79: 89 */       amj localamj = this.a[paramInt1].a(paramInt2);
/*  80: 90 */       if (this.a[paramInt1].b == 0) {
/*  81: 91 */         this.a[paramInt1] = null;
/*  82:    */       }
/*  83: 93 */       this.d.a(this);
/*  84: 94 */       return localamj;
/*  85:    */     }
/*  86: 97 */     return null;
/*  87:    */   }
/*  88:    */   
/*  89:    */   public void a(int paramInt, amj paramamj)
/*  90:    */   {
/*  91:102 */     this.a[paramInt] = paramamj;
/*  92:103 */     this.d.a(this);
/*  93:    */   }
/*  94:    */   
/*  95:    */   public int p_()
/*  96:    */   {
/*  97:108 */     return 64;
/*  98:    */   }
/*  99:    */   
/* 100:    */   public void o_() {}
/* 101:    */   
/* 102:    */   public boolean a(ahd paramahd)
/* 103:    */   {
/* 104:117 */     return true;
/* 105:    */   }
/* 106:    */   
/* 107:    */   public void b(ahd paramahd) {}
/* 108:    */   
/* 109:    */   public void c(ahd paramahd) {}
/* 110:    */   
/* 111:    */   public boolean b(int paramInt, amj paramamj)
/* 112:    */   {
/* 113:130 */     return true;
/* 114:    */   }
/* 115:    */   
/* 116:    */   public int a_(int paramInt)
/* 117:    */   {
/* 118:135 */     return 0;
/* 119:    */   }
/* 120:    */   
/* 121:    */   public void b(int paramInt1, int paramInt2) {}
/* 122:    */   
/* 123:    */   public int g()
/* 124:    */   {
/* 125:144 */     return 0;
/* 126:    */   }
/* 127:    */   
/* 128:    */   public void l()
/* 129:    */   {
/* 130:149 */     for (int i = 0; i < this.a.length; i++) {
/* 131:150 */       this.a[i] = null;
/* 132:    */     }
/* 133:    */   }
/* 134:    */   
/* 135:    */   public int h()
/* 136:    */   {
/* 137:155 */     return this.c;
/* 138:    */   }
/* 139:    */   
/* 140:    */   public int i()
/* 141:    */   {
/* 142:159 */     return this.b;
/* 143:    */   }
/* 144:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     ain
 * JD-Core Version:    0.7.0.1
 */