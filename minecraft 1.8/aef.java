/*   1:    */ import java.util.List;
/*   2:    */ 
/*   3:    */ public class aef
/*   4:    */   extends aed
/*   5:    */   implements bdd
/*   6:    */ {
/*   7: 22 */   private boolean a = true;
/*   8: 23 */   private int b = -1;
/*   9: 24 */   private dt c = dt.a;
/*  10:    */   
/*  11:    */   public aef(aqu paramaqu)
/*  12:    */   {
/*  13: 27 */     super(paramaqu);
/*  14:    */   }
/*  15:    */   
/*  16:    */   public aef(aqu paramaqu, double paramDouble1, double paramDouble2, double paramDouble3)
/*  17:    */   {
/*  18: 31 */     super(paramaqu, paramDouble1, paramDouble2, paramDouble3);
/*  19:    */   }
/*  20:    */   
/*  21:    */   public adz s()
/*  22:    */   {
/*  23: 36 */     return adz.f;
/*  24:    */   }
/*  25:    */   
/*  26:    */   public bec u()
/*  27:    */   {
/*  28: 41 */     return aty.cp.P();
/*  29:    */   }
/*  30:    */   
/*  31:    */   public int w()
/*  32:    */   {
/*  33: 46 */     return 1;
/*  34:    */   }
/*  35:    */   
/*  36:    */   public int n_()
/*  37:    */   {
/*  38: 51 */     return 5;
/*  39:    */   }
/*  40:    */   
/*  41:    */   public boolean e(ahd paramahd)
/*  42:    */   {
/*  43: 56 */     if (!this.o.D) {
/*  44: 57 */       paramahd.a(this);
/*  45:    */     }
/*  46: 60 */     return true;
/*  47:    */   }
/*  48:    */   
/*  49:    */   public void a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
/*  50:    */   {
/*  51: 65 */     boolean bool = !paramBoolean;
/*  52: 67 */     if (bool != y()) {
/*  53: 68 */       i(bool);
/*  54:    */     }
/*  55:    */   }
/*  56:    */   
/*  57:    */   public boolean y()
/*  58:    */   {
/*  59: 73 */     return this.a;
/*  60:    */   }
/*  61:    */   
/*  62:    */   public void i(boolean paramBoolean)
/*  63:    */   {
/*  64: 77 */     this.a = paramBoolean;
/*  65:    */   }
/*  66:    */   
/*  67:    */   public aqu z()
/*  68:    */   {
/*  69: 82 */     return this.o;
/*  70:    */   }
/*  71:    */   
/*  72:    */   public double A()
/*  73:    */   {
/*  74: 87 */     return this.s;
/*  75:    */   }
/*  76:    */   
/*  77:    */   public double B()
/*  78:    */   {
/*  79: 92 */     return this.t;
/*  80:    */   }
/*  81:    */   
/*  82:    */   public double C()
/*  83:    */   {
/*  84: 97 */     return this.u;
/*  85:    */   }
/*  86:    */   
/*  87:    */   public void s_()
/*  88:    */   {
/*  89:102 */     super.s_();
/*  90:104 */     if ((!this.o.D) && (ai()) && (y()))
/*  91:    */     {
/*  92:105 */       dt localdt = new dt(this);
/*  93:106 */       if (localdt.equals(this.c)) {
/*  94:107 */         this.b -= 1;
/*  95:    */       } else {
/*  96:109 */         m(0);
/*  97:    */       }
/*  98:112 */       if (!E())
/*  99:    */       {
/* 100:113 */         m(0);
/* 101:115 */         if (D())
/* 102:    */         {
/* 103:116 */           m(4);
/* 104:117 */           o_();
/* 105:    */         }
/* 106:    */       }
/* 107:    */     }
/* 108:    */   }
/* 109:    */   
/* 110:    */   public boolean D()
/* 111:    */   {
/* 112:124 */     if (bde.a(this)) {
/* 113:125 */       return true;
/* 114:    */     }
/* 115:128 */     List localList = this.o.a(adw.class, aQ().b(0.25D, 0.0D, 0.25D), xe.a);
/* 116:130 */     if (localList.size() > 0) {
/* 117:131 */       bde.a(this, (adw)localList.get(0));
/* 118:    */     }
/* 119:134 */     return false;
/* 120:    */   }
/* 121:    */   
/* 122:    */   public void a(wh paramwh)
/* 123:    */   {
/* 124:139 */     super.a(paramwh);
/* 125:    */     
/* 126:141 */     a(alq.a(aty.cp), 1, 0.0F);
/* 127:    */   }
/* 128:    */   
/* 129:    */   protected void b(fn paramfn)
/* 130:    */   {
/* 131:146 */     super.b(paramfn);
/* 132:147 */     paramfn.a("TransferCooldown", this.b);
/* 133:    */   }
/* 134:    */   
/* 135:    */   protected void a(fn paramfn)
/* 136:    */   {
/* 137:152 */     super.a(paramfn);
/* 138:153 */     this.b = paramfn.f("TransferCooldown");
/* 139:    */   }
/* 140:    */   
/* 141:    */   public void m(int paramInt)
/* 142:    */   {
/* 143:157 */     this.b = paramInt;
/* 144:    */   }
/* 145:    */   
/* 146:    */   public boolean E()
/* 147:    */   {
/* 148:161 */     return this.b > 0;
/* 149:    */   }
/* 150:    */   
/* 151:    */   public String k()
/* 152:    */   {
/* 153:166 */     return "minecraft:hopper";
/* 154:    */   }
/* 155:    */   
/* 156:    */   public aib a(ahb paramahb, ahd paramahd)
/* 157:    */   {
/* 158:171 */     return new aix(paramahb, this, paramahd);
/* 159:    */   }
/* 160:    */ }


/* Location:           C:\Users\Hugo Haldi\Desktop\Decompile Minecraft\1.8.jar
 * Qualified Name:     aef
 * JD-Core Version:    0.7.0.1
 */